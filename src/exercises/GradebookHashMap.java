package exercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class GradebookHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        System.out.println("This program will print roster and terminate after a blank value is entered for student name!");
        System.out.print("Enter Student Name: ");
        String input = sc.nextLine();
        while(!input.equals("")) {
            System.out.print("Enter Student ID # for " + input + ": ");
            int id = scc.nextInt();
            students.putIfAbsent(id, input);
            System.out.print("Enter Student Name: ");
            input = sc.nextLine();
        }
        sc.close();
        scc.close();
        Collection<Integer> theKeys = students.keySet();
        for(Integer stu : theKeys) {
            System.out.println(stu + ": " + students.get(stu));
        }
    }
}
