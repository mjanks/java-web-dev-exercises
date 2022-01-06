package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] myArr = {1, 1, 2, 3, 5, 8};
        String myStr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        System.out.print("All values: ");
        for (int i : myArr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Odd values: ");
        for (int i : myArr) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        String[] myStringArr = myStr.split(" ");
        System.out.println(Arrays.toString(myStringArr));
        myStringArr = myStr.split("\\.");
        System.out.println(Arrays.toString(myStringArr));
    }
}
