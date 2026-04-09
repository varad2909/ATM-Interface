import java.util.Scanner;

public class ATMOperations {

    private Account account;
    private Transaction transaction;

    public ATMOperations(Account account, Transaction transaction) {
        this.account = account;
        this.transaction = transaction;
    }

    public void showTransactionHistory() {
        transaction.showHistory();
    }

    public void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (account.withdraw(amount)) {
            transaction.add("Withdrawn: ₹" + amount);
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        account.deposit(amount);
        transaction.add("Deposited: ₹" + amount);
        System.out.println("Deposit Successful!");
    }

    public void transfer(Scanner sc) {
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (account.withdraw(amount)) {
            transaction.add("Transferred: ₹" + amount);
            System.out.println("Transfer Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
