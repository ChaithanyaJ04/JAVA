class CollegeThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {  // print 5 times
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);  // 10 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CSEThread extends Thread {
    public void run() {
        try {
            // Since CSE prints every 2 seconds and BMS every 10 seconds,
            // we need 5 CSE prints for each 1 BMS print → total 25 prints
            for (int i = 0; i < 25; i++) {
                System.out.println("CSE");
                Thread.sleep(2000);  // 2 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CollegeThread t1 = new CollegeThread();
        CSEThread t2 = new CSEThread();

        t1.start();
        t2.start();
    }
}

