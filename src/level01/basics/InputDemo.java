package level01.basics;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Student Registration Form =====");

        System.out.print("Enter Full Name: ");
        String fullName = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = input.nextDouble();

        System.out.print("Enter Percentage: ");
        float percentage = input.nextFloat();

        System.out.print("Enter Gender (M/F): ");
        char gender = input.next().charAt(0);

        System.out.print("Are you placed? (true/false): ");
        boolean isPlaced = input.nextBoolean();

        System.out.println("\n===== Student Details =====");

        System.out.println("Name       : " + fullName);
        System.out.println("Age        : " + age);
        System.out.println("CGPA       : " + cgpa);
        System.out.println("Percentage : " + percentage);
        System.out.println("Gender     : " + gender);
        System.out.println("Placed     : " + isPlaced);

        input.close();
    }
}