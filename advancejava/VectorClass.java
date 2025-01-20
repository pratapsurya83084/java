import java.util.*;

public class VectorClass {
   public static void main(String[] args){
    Vector<String> vec = new Vector<String>(6);
     
    System.out.println("the size of the vector is : "+vec.size());
  vec.add("1");
  vec.add("2");
  vec.add("3");
  vec.add("4");
  vec.add("5");
  vec.add("6");   //in 6th length capacity is  = 6 

  vec.add("7");  //in 6th length capacity is  = 12

  vec.add("8");
  vec.add("9");
  vec.add("10");
  vec.add("11");
  vec.add("12"); ///in 12th length capacity is  = 12

  vec.add("13");  ////in 13th length capacity is  = 24

  System.out.println("after adding size is : "+vec.size());

  System.out.println("after adding capacity is : "+vec.capacity()); //capacity s 6

  vec.addElement("f1");
  vec.addElement("g");
  System.out.println(vec);


  //display vector elements using traverse
  Enumeration en =vec.elements();
  while (en.hasMoreElements()) {
    System.out.println(en.nextElement() + " ");
  }

   } 
}
