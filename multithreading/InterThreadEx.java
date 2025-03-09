
class Count extends Thread {

    // method run ovverride

    int count = 0; // 1 ,2,3 ,....10

    public  void run() {

        // 1 to 10
        for (int i = 1; i <= 10; i++) {
        //  System.out.println("iteration print :"+i);
        count = count+1;
            try {
                Thread.sleep(1000); // delay for 1 second
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        

    }

}

public class InterThreadEx {
    public static void main(String[] args) {

        Count t1 = new Count();

        t1.start();
     
      try {
        t1.join();
      } catch (Exception e) {
     e.printStackTrace();
      }

        System.out.println("count is:" + t1.count);

    }
}
