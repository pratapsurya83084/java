

public class Base{
public Base(){
    System.out.println("Base constructor");
}

public void fun(){
    System.out.println("Base function");
}
}



class derived extends Base{
// public int x,y;

public derived(){
    System.out.println("Derived constructor");
}

public void gun(){
    System.out.println("Derived function");
}

 }



class singleInheritance{
    public static void main(String[] args) {
        derived obj = new derived();

        obj.fun();
        obj.gun();
      
    }
 }


