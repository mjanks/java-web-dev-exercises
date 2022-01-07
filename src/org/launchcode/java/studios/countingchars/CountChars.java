package org.launchcode.java.studios.countingchars;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {

    public static void main(String[] args) {
        HashMap<Character, Integer> tony = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myStr = scan.nextLine();
        myStr = myStr.toLowerCase();

        for(int i=0; i < myStr.length(); i++) {
            int asciiValue = myStr.charAt(i);
            if(asciiValue > 96 && asciiValue < 123) {
                if(!tony.containsKey(myStr.charAt(i))) {
                    tony.put(myStr.charAt(i), 1);
                } else {
                    tony.put(myStr.charAt(i), tony.get(myStr.charAt(i)) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : tony.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }
    }
}
