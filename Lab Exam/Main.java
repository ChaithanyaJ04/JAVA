import mybank.Customer;
import mycustomer.MyProfile;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Customer from mybank package
        Customer customer = new Customer();
        double balance = customer.balance();
        System.out.println("Customer balance: " + balance);

        // Overloaded balance methods
        double usdBalance = customer.balance("USD");
        System.out.println("Customer balance in USD: " + usdBalance);

        double savingsBalance = customer.balance(1);
        System.out.println("Customer savings balance: " + savingsBalance);

        // Create an instance of MyProfile from mycustomer package
        MyProfile profile = new MyProfile();
        profile.display();

        // Overloaded display methods
        profile.display("Name");
        profile.display(true);
    }
}
