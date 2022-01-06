package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static int sumEvens(ArrayList<Integer> list) {
        int sum = 0;
        for(int i=0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void printFiveLetterWords(ArrayList<String> wordlist) {
        System.out.print("Five letter words found in the list: ");
        for(int i=0; i < wordlist.size(); i++) {
//            System.out.println("size: " + wordlist.size());
            if(wordlist.get(i).length() == 5) {
                System.out.print(wordlist.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String myStr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        ArrayList<String> myWordList = new ArrayList<String>();
        myWordList.add("Hello");
        myWordList.add("World");
        myWordList.add("Programming");
        myWordList.add("java");
        myWordList.add("&^%$#");

        for(int i=0; i < 10; i++) {
            myArrList.add(i * 2);
        }
        System.out.println(Arrays.toString(myArrList.toArray()));
        System.out.println("The sum of the integers in the array is " + sumEvens(myArrList));

        printFiveLetterWords(myWordList);

        String[] myStrArr = myStr.split(" ");
        List largerWordList = Arrays.asList(myStrArr);
        ArrayList largerWordList2 = new ArrayList(largerWordList);
        printFiveLetterWords(largerWordList2);
    }
}
