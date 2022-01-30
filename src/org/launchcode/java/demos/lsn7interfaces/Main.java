package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // Flavors before and after
        System.out.println("Flavors before sort:");
        for(Flavor flavor : flavors)
            System.out.println(flavor.getName());

        flavors.sort(new FlavorComparator());

        System.out.println("\nFlavors after sort:");
        for(Flavor flavor : flavors)
            System.out.println(flavor.getName());

        // Cones before and after
        System.out.println("\nCones before sort:");
        for(Cone cone : cones)
            System.out.println("$" + cone.getCost());

        cones.sort(new ConeComparator());

        System.out.println("\nCones after sort:");
        for(Cone cone : cones)
            System.out.println("$" + cone.getCost());
    }
}
