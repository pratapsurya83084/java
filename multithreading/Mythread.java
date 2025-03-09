public class Mythread extends Thread {
    public void run() {
        System.out.println("Thread 1  is running...");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Thread 2  is running...");

    }

    public void run1() {
        System.out.println("Thread 2  is running...");
    }

    public void run2() {
        System.out.println("Thread  3 is running...");
    }

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start(); // Starts the thread

    }
}
