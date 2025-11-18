import CIE.*;
import SEE.*;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Internals[] internal = new Internals[n];
        External[] external = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            internal[i] = new Internals(usn, name, sem);
            internal[i].getMarks();

            external[i] = new External(usn, name, sem);
            external[i].getMarks();
        }

        System.out.println("\n----- Final Marks of Students -----");
        for (int i = 0; i < n; i++) {
            internal[i].display();
            System.out.println("Final Marks in 5 Subjects:");
            for (int j = 0; j < 5; j++) {
                int finalMarks = internal[i].internalMarks[j] + (external[i].seeMarks[j] / 2);
                System.out.println("Subject " + (j + 1) + ": " + finalMarks);
            }
            System.out.println();
        }
    }
}
