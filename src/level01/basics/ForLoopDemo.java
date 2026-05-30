package level01.basics;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;


        for (int subject = 1; subject <= 5; subject++) {

            System.out.print("Enter Marks of Subject " + subject + ": ");
            int marks = sc.nextInt();

            totalMarks += marks;
        }

        double average = totalMarks / 5.0;

        System.out.println("\nTotal Marks : " + totalMarks);
        System.out.println("Average     : " + average);

        sc.close();
    }
}
