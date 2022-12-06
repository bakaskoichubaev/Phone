import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone",8,new BigDecimal("1200"));
        Phone phone1 = new Phone("Samsung",8,new BigDecimal("1000"));

        Employee employee = new Employee("Alibek",new BigDecimal("1200000"),
                LocalDate.of(2002,3,2),new ArrayList<>(List.of(phone)),Gender.MALE);
        Employee employee1 = new Employee("Alinur",new BigDecimal("1200"),
                LocalDate.of(2000,6,28),new ArrayList<>(List.of(phone1)),Gender.MALE);
        Employee employee2 = new Employee("Nazmi",new BigDecimal("34000"),
                LocalDate.of(2005,5,8),new ArrayList<>(List.of(phone)),Gender.FEMALE);
        Employee employee3 = new Employee("Aigul",new BigDecimal("340090"),
                LocalDate.of(2003,3,12),new ArrayList<>(List.of(phone1)),Gender.FEMALE);


        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();


        List<Employee> employees = new ArrayList<>(List.of(employee,employee1,employee2,employee3));
        System.out.println(employeeService.create(employees));
        System.out.println(employeeService.findAll());
        System.out.println(employeeService.removeEmployee("Aigul", employees));
        System.out.println(employeeService.findAll());

        employeeService.grouping(employees);


        System.out.println(employeeService.removeEmployeeGender("FEMALE", employees));
        System.out.println(employeeService.findAll());
    }
}