package level01.basics;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctPassword = "java123";
        String password;

        int attempts = 0;

        do {

            System.out.print("Enter Password: ");
            password = input.nextLine();

            attempts++;

            if(password.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break;
            } else {
                System.out.println("Wrong Password");
            }

        } while(attempts < 3);

        if(!password.equals(correctPassword)) {
            System.out.println("Account Locked!");
        }

        input.close();
    }
}
