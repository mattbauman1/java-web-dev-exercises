package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("/Users/mattbauman/Documents/LC_Java/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/input.txt"));
            String input = "";
            while(sc.hasNextLine()) {
                input += sc.nextLine();
            }
            sc.close();
            input = input.toLowerCase();
            char[] strArray = input.toCharArray();
            HashMap<Character, Integer> charCounts = new HashMap<>();
            Character[] allowedChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            HashSet<Character> allowedCharsSet = new HashSet<>(Arrays.asList(allowedChars));
            for(int itt = 0; itt < strArray.length; itt++) {
                if(allowedCharsSet.contains(strArray[itt])) {
                    charCounts.putIfAbsent(strArray[itt], 0);
                    charCounts.replace(strArray[itt], charCounts.get(strArray[itt]) + 1);
                }
            }
            Collection<Character> theKeys = charCounts.keySet();
            for(Character ch : theKeys) {
                System.out.println(ch + ": " + charCounts.get(ch));
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File is not there!");
        }
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text to count characters in: ");*/
    }
}
