//interThread , 2 thread synchronized method

class Q {
    int num;

    public void put(int num) {
        System.out.println(num);
        this.num = num;

    }

    public void get() {
        System.out.println(num);
    }

}

// producer class
class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

// consumer
class Consumer implements Runnable {
    Q q;

    void Producer(Q q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (true) {
            q.get();

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

public class Synchro {
    public static void main(String[] args) {
Q q=new Q();
new Producer(q);
// new Consumer(q);
    }
}
