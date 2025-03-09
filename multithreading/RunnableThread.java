// package multithreading;

public class RunnableThread implements Runnable {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("reverse number :" + i);
        }
    }

    public static void main(String[] args) {
        RunnableThread t1 = new RunnableThread();
        Mythread t2 = new Mythread();
        Thread thread = new Thread(t1);

        thread.start();
        t2.start();
    }
}
