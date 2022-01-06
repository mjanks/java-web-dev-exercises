package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius;
        double area;

        System.out.println("Enter a radius:");
        radius = scan.nextDouble();
        area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is: " + area);
    }
}
