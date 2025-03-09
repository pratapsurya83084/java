
// public class ThreadOPrataion extends Thread {
//     public void run() {

//         for (int i = 0; i <= 5; i++) {
//             System.out.println(Thread.currentThread().getName() + "-count :" + i);

//             try {
//                 Thread.sleep(1000); // wait 1 second
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//             }
//         }
//     }

//     public static void main(String[] args) {
//         ThreadOPrataion thread1 = new ThreadOPrataion();
//         ThreadOPrataion thread2 = new ThreadOPrataion();
//         thread1.setName("Thread first");
//         thread2.setName("Thread second");
//         thread1.start();
//         thread2.start();
//     }

// }

class ThreadOPrataion extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
System.out.println(Thread.currentThread().getName()+"-count :"+i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


public static void main(String[] args) {
    ThreadOPrataion thread1 = new ThreadOPrataion();
    ThreadOPrataion thread2 = new ThreadOPrataion();


    thread1.setName("t1 execute ");
    thread2.setName("t2 execute ");

    thread1.start();
    thread2.start();
    
}



}