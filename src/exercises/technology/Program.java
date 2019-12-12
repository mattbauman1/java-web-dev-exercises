package exercises.technology;

import org.junit.Before;

import java.util.SortedMap;

public class Program {
    public static void main(String[] args) {
        LapTop myLaptop = new LapTop("Apple", 128, 2.43, 2, 0.54);
        SmartPhone mySmartPhone = new SmartPhone("Samsung", 16, 1.24, 7, 765);
        System.out.println("LapTop Info: " + myLaptop.getBrand() + ", " + myLaptop.getSpecs() + ", " + myLaptop.getLaptopSpecs());
        System.out.println("Phone Info: " + mySmartPhone.getBrand() + ", " + mySmartPhone.getSpecs() + ", " + mySmartPhone.getPhoneSpecs());
        System.out.println(myLaptop.getId() + "    " + mySmartPhone.getId());
    }
}