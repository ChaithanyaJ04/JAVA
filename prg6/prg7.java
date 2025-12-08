import java.util.Scanner;

// Custom Exception
class WrongAge extends Exception {
    WrongAge() {
        super("Wrong Age Entered");
    }

    WrongAge(String msg) {
        super(msg);
    }
}

// Father class
class Father {
    int fatherAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative");
        }
        fatherAge = age;
    }

    void display() {
        System.out.println("Father's Age: " + fatherAge);
    }
}

// Son class extending Father
class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        }

        this.sonAge = sonAge;
    }

    void display() {
        super.display();
        System.out.println("Son's Age: " + sonAge);
    }
}

// Main class
public class prg7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Father's Age: ");
            int fAge = sc.nextInt();

            System.out.print("Enter Son's Age: ");
            int sAge = sc.nextInt();

            Son obj = new Son(fAge, sAge);

            obj.display();

        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
