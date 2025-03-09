
class Counter {

    int count = 0;   //shared resource  1000

    // sync method
    public synchronized void increament() {
        count++;    ///1
    }

    public int getcount() {
        return count;
    }

}

public class SynchronizationExample {

    public static void main(String[] args) {

        Counter countre = new Counter();

        //thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <1000; i++) {
                countre.increament();   //1
            }
        });


        //thread 2
        Thread t2 = new Thread(()->{
    for (int i = 0; i <1000; i++) {
        countre.increament();      //1
    }
        });

        t1.start();    //1000
        t2.start();   // 1000

try {
    t1.join();//wait for t1 thread
    t2.join();//wait for t1 thread

} catch (Exception e) {
    e.printStackTrace();
}

System.out.println("final count :"+countre.getcount());

    }

}
