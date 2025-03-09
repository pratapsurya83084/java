
class MyThread {
    int n;

    synchronized static void printTable(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("the table is : " + n * i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    
}
class Thread1 extends Thread {
    public void run() {
        MyThread.printTable(1);

    }
}

class Thread2 extends Thread {
    public void run() {
        MyThread.printTable(2);

    }
}

class Thread3 extends Thread {
    public void run() {
        MyThread.printTable(3);

    }
}


public class SynchronizationThreadEx {
    public static void main(String[] args) {
        Thread1  t1 = new Thread1();
        Thread2  t2 = new Thread2();
        Thread3  t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();

    }

}
