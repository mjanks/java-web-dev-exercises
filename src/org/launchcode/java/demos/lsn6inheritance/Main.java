package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat myCat = new HouseCat("Joey", 15.6);
        myCat.eat();
        System.out.println(myCat.isTired());

        HouseCat jones = new HouseCat("Jones");
        System.out.println(jones.getWeight());

        // Cannot instantiate abstract class!
//        Cat salem = new Cat(8);
    }
}
