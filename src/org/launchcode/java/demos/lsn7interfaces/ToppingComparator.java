package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {

    @Override
    public int compare(Topping o1, Topping o2) {
        double diff = o2.getCost() - o1.getCost();
        if(diff > 0)
            return 1;
        else if(diff < 0)
            return -1;
        else
            return 0;
    }
}
