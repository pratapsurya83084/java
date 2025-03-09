public class MyDemonThread extends Thread {
    public void run() {

        while (true) {

            System.out.println("deonThread is running ....");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        MyDemonThread thread = new MyDemonThread();

        thread.setDaemon(true);
        thread.start();

        // main thread is running

        for (int i = 0; i <= 5; i++) {
            System.out.println("the main thrad is rnning :" + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Main thread finished. Daemon thread will stop automatically.");
    }
}
