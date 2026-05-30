package level01.basics;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Marks: ");
        int marks = input.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        int attendance = input.nextInt();

        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks);
        System.out.println("Attendance : " + attendance + "%");

        // Simple If
        if (marks == 100) {
            System.out.println("🏆 Perfect Score!");
        }

        // If-Else
        if (marks >= 40) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }

        // Else-If Ladder
        if (marks >= 90) {
            System.out.println("Grade      : A");
        } else if (marks >= 75) {
            System.out.println("Grade      : B");
        } else if (marks >= 60) {
            System.out.println("Grade      : C");
        } else if (marks >= 40) {
            System.out.println("Grade      : D");
        } else {
            System.out.println("Grade      : F");
        }

        // Nested If
        if (marks >= 40) {
            if (attendance >= 75) {
                System.out.println("Certificate: Eligible");
            } else {
                System.out.println("Certificate: Not Eligible (Low Attendance)");
            }
        }

        input.close();
    }
}