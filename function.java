import java.util.*;
public class function {


    public static void sum(int num1,int num2 ) {
        int sum =num1+num2;
        System.out.println("the sum of 2 number is:"+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("enter 2 number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum(num1,num2);
        sc.close();
    }
}
