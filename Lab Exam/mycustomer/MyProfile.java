package mycustomer;

public class MyProfile {
    public void display() {
        System.out.println("Profile displayed");
    }

    public void display(String field) {
        System.out.println("Displaying " + field + ": Profile info");
    }

    public void display(boolean detailed) {
        if (detailed) {
            System.out.println("Detailed profile: Name, Age, Address");
        } else {
            System.out.println("Profile displayed");
        }
    }
}
