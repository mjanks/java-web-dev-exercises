package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // Flavors before and after
//        System.out.println("Flavors before sort:");
//        for(Flavor flavor : flavors)
//            System.out.println(flavor.getName());
//
//        flavors.sort(new FlavorComparator());
//
//        System.out.println("\nFlavors after sort:");
//        for(Flavor flavor : flavors)
//            System.out.println(flavor.getName());

        // Allergens before and after
        System.out.println("Flavor allergens before sort:");
        for(Flavor flavor : flavors)
            System.out.println(flavor.getAllergens() + " (" + flavor.getAllergens().size() + ")");

        flavors.sort(new FlavorComparator());

        System.out.println("\nFlavor allergens after sort:");
        for(Flavor flavor : flavors)
            System.out.println(flavor.getAllergens() + " (" + flavor.getAllergens().size() + ")");

        // Cones before and after
        System.out.println("\nCones before sort:");
        for(Cone cone : cones)
            System.out.println("$" + cone.getCost());

        cones.sort(new ConeComparator());

        System.out.println("\nCones after sort:");
        for(Cone cone : cones)
            System.out.println("$" + cone.getCost());

        // Toppings before and after, cost highest to lowest
        System.out.println("\nToppings before sort:");
        for(Topping topping : toppings)
            System.out.println("$" + topping.getCost());

        toppings.sort(new ToppingComparator());

        System.out.println("\nToppings after sort:");
        for(Topping topping : toppings)
            System.out.println("$" + topping.getCost());
    }
}
