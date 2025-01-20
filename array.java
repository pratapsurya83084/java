// public class array {
//    public static void main(String[] args) {
//     int  marks[] = new int[3];
//     marks[0] = 90;
//     marks[1] = 85;
//     marks[2] = 80;
//     // System.out.println(marks[0]);
//     // System.out.println(marks[1]);
//     // System.out.println(marks[2]);

//     for (int i = 0; i <marks.length; i++) {
//         System.out.println(marks[i]);
//     }
// } 
// }

//take a 5 numaber and display it
// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter 5 numbers:");
//         int[] numbers = new int[5]; // Array to store 5 numbers

//         // Taking input from user
//         for (int i = 0; i < 5; i++) {
//             System.out.print("Enter number " + (i + 1) + ": ");
//             numbers[i] = sc.nextInt();
//         }

//         // Displaying the numbers entered
//         System.out.println("The numbers you entered are:");
//         for (int i = 0; i < 5; i++) {
//             System.out.println(numbers[i]);
//         }

//         sc.close();
//     }
// }


import java.util.*;

public class array {
public static void main(String[] args) {
    int arrays[] =new int[5];
         
    Scanner scanner = new Scanner(System.in);
    // scanner.nextInt();
    System.out.println("enter 5 number :");

  for (int i = 0; i < 5; i++) {
    arrays[i] = scanner.nextInt();

  }

  System.out.println("enter number you want to search:");
    int n = scanner.nextInt();
  //output
  for (int i = 0; i < 5; i++) {
    if (arrays[i]==n) {
        System.out.println("your number "+ n + " is found at index no: " + i);
    }
   
    // System.out.println("your number is:"+ arrays[i]);
  }
 


  for (int i = 0; i < 5; i++) {
    if (arrays[i]!=n) {
        System.out.println("your number "+ n + " is not found of an array " );
    }
   
    // System.out.println("your number is:"+ arrays[i]);
  }
    // System.out.println("your number is not found in an array");


  scanner.close();

}
}


