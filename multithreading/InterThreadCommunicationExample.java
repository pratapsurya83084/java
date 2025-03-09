class SharedResource {
    private int data;
    private boolean isProduced = false;

    // Method to produce data
    public synchronized void produce(int value) {
        while (isProduced) {
            try {
                wait(); // Wait if data is already produced
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = value;
        isProduced = true;
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer
    }

    // Method to consume data
    public synchronized void consume() {
        while (!isProduced) {
            try {
                wait(); // Wait if no data is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notify(); // Notify the producer
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer Thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
                try {
                    Thread.sleep(500); // Simulate time delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
                try {
                    Thread.sleep(1000); // Simulate time delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
