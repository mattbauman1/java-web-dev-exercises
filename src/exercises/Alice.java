package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to search the Alice Text for: ");
        String query = sc.nextLine();
        sc.close();
        int querySize = query.length();
        System.out.println("The query: " + query + " :is " + querySize + " characters long.");
        String aliceOriginal = aliceText;
        aliceText = aliceText.toLowerCase();
        query = query.toLowerCase();
        //System.out.println(aliceText.contains(query));
        int queryStartIndex = aliceText.indexOf(query);
        System.out.println("The index of the query is at: " + queryStartIndex);
        //String[] splitString = aliceText.split(query);
        System.out.println(aliceOriginal.substring(0, queryStartIndex) + "\b" + aliceOriginal.substring(queryStartIndex + querySize));
    }
}
