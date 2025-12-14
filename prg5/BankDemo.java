import java.util.Scanner;

// Base class
class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name, int number, String type) {
        customerName = name;
        accountNumber = number;
        accountType = type;
        balance = 0.0;   // starts from zero
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful\n");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful\n");
        } else {
            System.out.println("Insufficient balance!\n");
        }
    }

    void displayAccount() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Type of Account: " + accountType + " account");
        System.out.println("Balance = " + balance + "\n");
    }
}

// Savings Account
class Sav_acct extends Account {

    Sav_acct(String name, int number) {
        super(name, number, "Savings");
    }

    void computeInterest() {
        double interest = balance * 0.05;   // 5% interest
        balance += interest;
        System.out.println("Interest added: " + interest + "\n");
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sav_acct[] acc = new Sav_acct[2];

        // Accept details for 2 customers
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Customer " + (i + 1));
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            acc[i] = new Sav_acct(name, accNo);
        }

        int choice;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute Interest");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) break;

            System.out.print("Enter account number: ");
            int ac = sc.nextInt();

            Sav_acct selected = null;
            for (int i = 0; i < 2; i++) {
                if (acc[i].accountNumber == ac)
                    selected = acc[i];
            }

            if (selected == null) {
                System.out.println("Invalid account number!\n");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    selected.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    selected.withdraw(sc.nextDouble());
                    break;

                case 3:
                    selected.computeInterest();
                    break;

                case 4:
                    selected.displayAccount();
                    break;

                default:
                    System.out.println("Invalid choice!\n");
            }

        } while (choice != 5);

        System.out.println("Exiting...");
        sc.close();
    }
}
