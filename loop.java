import java.util.*;
public class loop {
public static void main(String[] args) {
    // for (int counter=0 ;counter < 11 ;counter++) {
    //    System.out.print(counter +" "); 
    // }

//     int i=0;
// while (i<11) {
//     System.out.println(i);
//     i =i+1;
// }

// int i=0;

// do {
//     System.out.println(i);//first work your work and then
// i = i+1;
// } while (i < 11);  //after check condition
Scanner sc=new Scanner(System.in);
System.out.print("enter the number you want to print table:");
int n=sc.nextInt();
int sum;

for (int i=1;i<=10 ;i++) {
    sum=i*n;
System.out.println(sum); 
}

}

}

