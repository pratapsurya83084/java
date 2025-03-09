
class SharedResources extends Thread {
int n;
  synchronized  static void run(int n) {

        // 1 to 10 count
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
      System.out.println("the counter is : "+i);
        }

      
    }
}


//producer class
  class Producer extends Thread{
    
    synchronized public void  prod(int n){
        System.out.println("producer is running");
        SharedResources.run(n);
        
    }
}



//consumer class
class Consumer extends Thread{
    
    synchronized public void  prod(){
        System.out.println("consumer is running");
    }
}

public class ProdConsu {
    public static void main(String[] args) {
Producer p1= new Producer();
Consumer c1= new Consumer();
p1.prod(10);
c1.prod();
    }
}
