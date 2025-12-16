package mybank;

public class Customer {
    public double balance() {
        return 1000.0; // Sample balance
    }

    public double balance(String currency) {
        if ("USD".equals(currency)) {
            return 1000.0;
        } else if ("EUR".equals(currency)) {
            return 850.0;
        }
        return 1000.0;
    }

    public double balance(int accountType) {
        if (accountType == 1) {
            return 1000.0; // Savings
        } else if (accountType == 2) {
            return 500.0; // Checking
        }
        return 1000.0;
    }
}
