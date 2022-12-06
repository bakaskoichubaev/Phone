import java.math.BigDecimal;

public class Phone {
    private String name;
    private double memory;
    private BigDecimal price;

    public Phone(String name, double memory, BigDecimal price) {
        this.name = name;
        this.memory = memory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "\nname='" + name + '\'' +
                ", \nmemory=" + memory +
                ", \nprice=" + price +
                '}';
    }
}
