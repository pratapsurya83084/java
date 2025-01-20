import java.util.Scanner;

import java.util.Arrays;
 
public class sortCities {

    public static void main(String[] args) {
        int n;
        System.out.println("enter number of cities :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();


        // make a array
        String[] cities=new String[n];

        System.out.println("enter cities to sorting ascending order : ");
       for (int i = 0; i < n; i++) {
           cities[i]=sc.nextLine();
       }


    //    show all city
    System.out.println("show cities All : ");
    for (int i = 0; i < n; i++) {
        System.out.println(cities[i]);
    }

    // sort cities
Arrays.sort(cities);
    System.out.println("show cities sorted : ");
    for (int j = 0; j < n; j++) {
        System.out.println(cities[j]);
    }

    }
}