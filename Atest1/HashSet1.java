import java.util.*;
public class HashSet1 {
    public static void main(String[]  args){
        HashSet set=new HashSet();

        set.add("11");
        set.add("33");
        set.add("44");
        set.add(""); //allows null values
        System.out.println(set); //duplicate values not allow not print ,
                                 //stored element in the table storage allows null values insertion order maintained ,best approach for search value

        
    }
}
