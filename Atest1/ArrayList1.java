import java.util.*;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList list=new ArrayList();

        list.add("2");
        list.add("33");
        list.add("1");
        list.add("4");
        list.add("5");
        list.addFirst("111");
System.out.println("after added item list:");
        System.out.println(list);
list.remove("33");
System.out.println(list.contains("2"));
        System.out.println("aftr iterating array list itmes:");

        Iterator itr=list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
