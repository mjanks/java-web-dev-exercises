package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius = 0.0;
        double area = 0.0;
        boolean flag = false;

        do {
            System.out.println("Enter a radius:");
            try {
                radius = scan.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid datatype!");
                break;
            }
            flag = true;
        } while(radius <= 0);

        if(flag) {
            area = Circle.getArea(radius);
            System.out.println("The area of a circle with radius " + radius + " is: " + area);
        } else {
            System.out.println("Program terminated.");
        }
    }
}
