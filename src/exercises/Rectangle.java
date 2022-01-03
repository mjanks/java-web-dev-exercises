package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length:\r");
        int length = scan.nextInt();
        System.out.println("Enter the width:\r");
        int width = scan.nextInt();
        int area = length * width;
        System.out.println("Area is " + area);
    }
}
