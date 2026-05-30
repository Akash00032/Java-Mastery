package level01.basics;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 10000;

        System.out.println("===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Enter Your Choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Current Balance: ₹" + balance);
                break;
            case 2:
                System.out.print("Enter Deposit Amount: ₹");
                double deposit = input.nextDouble();

                balance += deposit;
                System.out.println("₹" + deposit + " deposited successfully.");
                System.out.println("Updated Balance: ₹" + balance);
                break;

            case 3:
                System.out.print("Enter Withdrawal Amount: ₹");
                double withdrawal = input.nextDouble();

                if (withdrawal <= balance) {
                    balance -= withdrawal;
                    System.out.println("₹" + withdrawal + " withdrawn successfully.");
                    System.out.println("Updated Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance.");
                }
                break;
            default:
                System.out.println("Invalid Choice.");
        }

        input.close();
    }
}
