package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        myStr = myStr.toLowerCase();
        System.out.println("Enter search term:");
        String searchTerm = scan.next();
        int result = myStr.indexOf(searchTerm.toLowerCase());
        if(result != -1) {
            System.out.println("Search term " + searchTerm + " was found at index " + myStr.indexOf(searchTerm.toLowerCase()));
        }
    }



}
