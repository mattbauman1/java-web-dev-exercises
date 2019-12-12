package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of a Circle Calculator, 'enter' with no input will exit!");
        System.out.print("What is the radius of the circle: ");
        String input = sc.nextLine();
        while(!input.equals("")) {
            try {
                Double radius = Double.parseDouble(input);
                if(radius >= 0) {
                    System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
                }
                else {
                    System.out.println("No negative radi allowed!");
                }
            }
            catch(Exception e) {
                System.out.println("Please enter a valid number!");
            }
            System.out.print("What is the radius of the circle: ");
            input = sc.nextLine();
        }
        sc.close();
        System.out.println("You have exited the program with no input value given!");
    }
}
