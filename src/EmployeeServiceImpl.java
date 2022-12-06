import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EployeeService{
    List<Employee> employees = new ArrayList<>();

    @Override
    public String create(List<Employee> employees) {
        this.employees.addAll(employees);
        return "Employees CREATED successfully!";
    }

    @Override
    public String removeEmployee(String name, List<Employee> employees) {
        boolean isRemoved  = this.employees.removeIf(employee -> employee.getName().equals(name));
        return isRemoved ? "Employee ("+name+") is REMOVED successfully!" : "REMOVED FAILED : INVALID NAME!";
    }

    @Override
    public List<Employee> findAll() {
        return this.employees;
    }

    @Override
    public List<Employee> findByName(String name, List<Employee> employees) {
        List<Employee> results = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getName().equals(name))
                results.add(employee);
        }
        return results;
    }

    @Override
    public void grouping(List<Employee> employees) {
        List<Employee> males = new ArrayList<>();
        List<Employee> females = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getGender().equals(Gender.MALE)) males.add(employee);
            else females.add(employee);
        }

        System.out.println("Males : " + males);
        System.out.println("Females : " + females);
    }

    @Override
    public String removeEmployeeGender(String gender, List<Employee> employees) {
        boolean isRemoved = this.employees.removeIf(employee -> employee.getGender().name().equals(gender.toUpperCase()));
        return isRemoved ? "Employees who's gender are ("+gender+") REMOVED successfully!" : "REMOVE FAILED : INVALID GENDER!";
    }

    @Override
    public void findPhoneEmployee(String phone, List<Employee> employees) {
        for (Employee employee : employees) {
            for (Phone employeePhone : employee.getPhones()) {
                if(employeePhone.getName().equals(phone))
                    System.out.println(employee);
            }
        }
    }

    @Override
    public int getAge(Employee employee) {
        return Period.between(employee.getLocalDate(),LocalDate.now()).getYears();
    }
}