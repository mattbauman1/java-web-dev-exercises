package exercises;

import java.util.Scanner;

public class MilesPerGal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many miles have you driven: ");
        int milesDriven = sc.nextInt();
        System.out.print("How many gals of gas did you burn: ");
        int gals = sc.nextInt();
        sc.close();
        System.out.print("Your MPG is: " + (double)milesDriven / (double)gals);
    }
}
