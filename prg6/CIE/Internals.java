package CIE;

import java.util.Scanner;

public class Internals extends Student {
    public int[] internalMarks = new int[5];

    public Internals(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Internal Marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            internalMarks[i] = sc.nextInt();
        }
    }
}
