/*userid = 12345
  PIN = 1234    */

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("12345", "1234");
        Account account = new Account(10000);
        Transaction transaction = new Transaction();
        ATMOperations atm = new ATMOperations(account, transaction);

        System.out.println("===== WELCOME TO ATM =====");

        System.out.print("Enter User ID: ");
        String uid = sc.next();

        System.out.print("Enter PIN: ");
        String pin = sc.next();

        if (user.validate(uid, pin)) {
            System.out.println("\nLogin Successful!");

            int choice;
            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                System.out.print("Enter Choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> atm.showTransactionHistory();
                    case 2 -> atm.withdraw(sc);
                    case 3 -> atm.deposit(sc);
                    case 4 -> atm.transfer(sc);
                    case 5 -> System.out.println("Thank You for Using ATM!");
                    default -> System.out.println("Invalid Choice!");
                }

            } while (choice != 5);

        } else {
            System.out.println("Invalid User ID or PIN!");
        }
        sc.close();
    }
}
