
import java.util.*;

interface Vehicle {
    double pi = 3.14;

    void circle(int radius);

    void reactangle(int l, int b);

    // 2*pi*r*h;
    void cynlinder(int heigth, int radius);

}

class Car implements Vehicle {
    public void circle(int radius) {
        System.out.println("the area of circle: " + 2 * pi * radius * radius);
    }

    public void reactangle(int l, int b) {
        System.out.println("the area of reactangle: " + l * b);
    }

    public void cynlinder(int height, int radius) {
     
        System.out.println("the area of the cylinder is:"+   2 * pi * height * radius);
    }

}

public class area {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter radius of cricle and rec:");

            int n;

            n = sc.nextInt();

            int l, b;
            System.out.println("enter the length the reactangle :");
            l = sc.nextInt();
            System.out.println("enter the  breadth reactangle :");
            b = sc.nextInt();

            Car obj = new Car();
            obj.circle(n);
            
   
            obj.reactangle(l, b);
   


            System.out.println("enter hight of cylinder :");

            int h, rad;
            h = sc.nextInt();
          
            rad = sc.nextInt();

            obj.cynlinder(h, rad);
        }



    }
}
