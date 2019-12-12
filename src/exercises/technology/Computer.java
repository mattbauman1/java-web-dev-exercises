package exercises.technology;

public class Computer extends AbstractEntity{
    private String brand;
    private int ram;
    private double clockSpeed;

    public Computer(String brand, int ram, double clockSpeed) {
        super();
        this.brand = brand;
        this.ram = ram;
        this.clockSpeed = clockSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getSpecs() {
        return "RAM: " + ram + ", Clock Speed: " + clockSpeed;
    }
}
