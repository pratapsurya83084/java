

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class TakeAndPrintElement {

    public static void main(String[] args) throws IOException {

        TreeSet t = new TreeSet();

        // how many element you want to enter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("how many element you want to enter:");
        int n = Integer.parseInt(br.readLine());

        Integer[] no = new Integer[n];

        System.out.println("enter element :");

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            no[i] = a;
            t.add(no[i]);
        }

 

        // traverse treset element
        System.out.println("stored element is :");
        Iterator itr = t.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}