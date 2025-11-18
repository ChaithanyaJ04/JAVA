package SEE;

import CIE.Student;
import java.util.Scanner;

public class External extends Student {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SEE Marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            seeMarks[i] = sc.nextInt();
        }
    }
}
