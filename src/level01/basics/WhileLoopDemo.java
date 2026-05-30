package level01.basics;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password = "";

        while (!password.equals("java123")) {

            System.out.print("Enter Password: ");
            password = input.nextLine();

            if (!password.equals("java123")) {
                System.out.println("Wrong Password! Try Again.");
            }
        }

        System.out.println("Login Successful!");

        input.close();
    }
}