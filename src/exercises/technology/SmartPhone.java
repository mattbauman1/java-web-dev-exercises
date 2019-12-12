package exercises.technology;

public class SmartPhone extends Computer {
    private double screenSize;
    private int photos;

    public SmartPhone(String brand, int ram, double clockSpeed, double screenSize, int photos) {
        super(brand, ram, clockSpeed);
        this.screenSize = screenSize;
        this.photos = photos;
    }

    public String getPhoneSpecs() {
        return "Screen Size: " + screenSize + ", Photos: " + photos;
    }
}
