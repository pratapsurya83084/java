import java.util.*;

// import java.util.*;
public class areaofreact {
    public static void main(String[] args) {
        int length = 2;
        int breadth = 5;
        Scanner sc = new Scanner(System.in); // Scanner is used to take input from user
        int len = sc.nextInt();
        int bred = sc.nextInt();
        System.out.println(len * bred);
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}
