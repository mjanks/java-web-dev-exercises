package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> studentIDList = new HashMap<>();

        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ids
        do {

            System.out.print("Student name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Id: ");
                int newId = input.nextInt();
                studentIDList.put(newId, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : studentIDList.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
