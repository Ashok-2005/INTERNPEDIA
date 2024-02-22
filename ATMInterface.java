import java.util.Scanner;

class UserAccount {
    private double balance;

    public UserAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false; // Withdrawal failed, insufficient balance
        }
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize User's Piggy Bank
        UserAccount userAccount = new UserAccount(1000.0); // Initial balance set to $1000.0

        // ATM Interface Loop
        while (true) {
            // User Interface Design
            System.out.println("\n ATM Interface");
            System.out.println("1.  Withdraw");
            System.out.println("2.  Deposit");
            System.out.println("3. ️ Check Balance");
            System.out.println("4.  Exit");
            System.out.print("Choose an option (1-4): ");

            // Options Implementation
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Withdraw
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (userAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Remaining balance: $" + userAccount.getBalance());
                    } else {
                        System.out.println("Withdrawal failed. Insufficient balance.");
                    }
                    break;

                case 2:
                    // Deposit
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: $" + userAccount.getBalance());
                    break;

                case 3:
                    // Check Balance
                    System.out.println("Current Balance: $" + userAccount.getBalance());
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM. Have a great day!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose a valid option (1-4).");
            }
        }
    }
}
