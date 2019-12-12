package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the width of the rectangle: ");
        int width = sc.nextInt();
        System.out.print("What is the length of the rectangle: ");
        int length = sc.nextInt();
        sc.close();
        System.out.println("The area of the rectangle is: " + width * length);
    }
}
