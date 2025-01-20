import java.util.*;


public class LinkedList1 {
public static void main(String[] args){
    LinkedList list=new LinkedList();



    list.add("2");
    list.add("9");
    list.add("6");
    list.add("");
    list.add("");
    list.addFirst("111");
    System.out.println(list.contains(""));//true ,null value is present.
System.out.println(list); //allow duplicate value ,maintain insertion order,this class is non-synchronus   ,allows null values.
}    
}
