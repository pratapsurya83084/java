import java.util.*;

public class vector1 {
    public static  void main(String[] args){
        Vector vec=new Vector(2);
        vec.add("44");
        vec.add("44");
        vec.add("44");
        vec.add("44");
        vec.add("44");
        vec.add("44");

        System.out.println(vec); //allows null value and maintain insertion order,extend abstract class and implement vector class,synchronized due to poor performance of search ,insert ,delete.
  
        Iterator en=vec.iterator();
        while (en.hasNext()) {
            System.out.println(en.next());
        }
   vec.addElement("44");
   vec.addElement("44");
   vec.addElement("44");
   vec.addFirst("44");
   vec.addFirst("44");
   vec.addFirst("44");
 System.out.println(vec.capacity());
    }
}
