import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Employee {
    private String name;
    private BigDecimal money;
    private LocalDate localDate;
    private List<Phone> phones;
    private Gender gender;

    public Employee(String name, BigDecimal money, LocalDate localDate, List<Phone> phones, Gender gender) {
        this.name = name;
        this.money = money;
        this.localDate = localDate;
        this.phones = phones;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nname='" + name + '\'' +
                "\nmoney=" + money +
                "\nlocalDate=" + localDate +
                "\nphones=" + phones +
                "\ngender=" + gender +
                "\n-------------------------";
    }
}