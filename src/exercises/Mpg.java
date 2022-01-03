package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the miles:\r");
        int miles = scan.nextInt();
        System.out.println("Enter the gallons of gas:\r");
        int gallons = scan.nextInt();
        int mpg = miles / gallons;
        System.out.println("Mpg is " + mpg);
    }
}
