import java.util.*;

public class ArrayIterator {
    public static void main(String [] args){
        ArrayList list = new ArrayList();
     list.add("ravi");
     list.add("prratap");
     list.add("atul");
     list.add("ajay");

     //traversing list through itrator
     Iterator itr =list.iterator();

     while (itr.hasNext()) {
        System.out.println("iterating arrraylist is : "+ itr.next());
     }

    }
}




