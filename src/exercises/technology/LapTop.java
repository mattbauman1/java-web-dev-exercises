package exercises.technology;

public class LapTop extends Computer {
    private int usbPorts;
    private double thickness;

    public LapTop(String brand, int ram, double clockSpeed, int usbPorts, double thickness) {
        super(brand, ram, clockSpeed);
        this.usbPorts = usbPorts;
        this.thickness = thickness;
    }

    public String getLaptopSpecs() {
        return "USB Ports: " + usbPorts + ", Thickness: " + thickness;
    }
}
