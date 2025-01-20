// import java.util.*;
// public class conditional {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your age");
//        int age = sc.nextInt();

//        if (age >= 18) {
//         System.out.println("you are a adult");
//        }else{
//         System.out.println("you are not adult");
//        }
//     }
// }

//check given no is odd or even
import java.util.*;
public class conditional{
    public static void main(String[]  args){
    Scanner sc =new Scanner(System.in);
   System.out.println("enter a");
    int a = sc.nextInt();
    System.out.println("enter b");
    int b = sc.nextInt(); 
    System.out.println("enter c");
    int c = sc.nextInt();

   if (a==b) {
    System.out.println("equal hai a and b");
   }else if (a > b) {
    System.out.println("a is greater than b");
   }else{
    System.out.println("b is greater than a ");
   }
    }
}