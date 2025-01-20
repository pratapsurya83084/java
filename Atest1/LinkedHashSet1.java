import java.util.*;
public class LinkedHashSet1 {
     public static void main(String[] args) {
        String strs="pratap is good boy";
       String aa= strs.split(strs);
       System.out.println(aa);
        String a=strs.split(" ");
          System.out.println(a.length());
        LinkedHashSet lset = new LinkedHashSet<>(6);
        lset.add("j");
        lset.add("h");
        lset.add("e");
        lset.add("kk ");
        lset.add("2 ");
        lset.add("23 ");
        lset.add("11 ");
        lset.add("5 ");
        lset.add("32 ");
        System.out.println(lset.size()); // linked hashset not allow duplictae values ,insertion order maintain

        Iterator itr = lset.iterator();
        while (itr.hasNext()) {
     System.out.println(itr.next());
        }
    }
}
