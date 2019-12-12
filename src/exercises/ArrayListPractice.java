package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        int seed = 1;
        while(seed < 50) {
            //System.out.println(seed);
            aList.add(seed);
            seed += 1;
        }
        System.out.println(sum(aList));
        /*List<String> bList = new ArrayList<>();
        bList.add("zebra");
        bList.add("goat");
        bList.add("cat");
        bList.add("horse");
        bList.add("dog");*/
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArray = str.split(" ");
        List<String> bList = new ArrayList<>();
        bList = Arrays.asList(strArray);
        System.out.print("What length of words should I print?: ");
        Scanner sc = new Scanner(System.in);
        int sizeToPrint = sc.nextInt();
        printFiveLetter(bList, sizeToPrint);
    }

    static int sum(List<Integer> theList) {
        int theReturn = 0;
        for(Integer num : theList) {
            if(num % 2 == 0) {
                theReturn += num;
            }
        }
        return theReturn;
    }

    static void printFiveLetter(List<String> theList, int size) {
        for(String str : theList) {
            if(str.length() == size) {
                System.out.println(str);
            }
        }
    }
}
