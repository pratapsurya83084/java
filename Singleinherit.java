

class firstclass{
    //method for 1st 
    public void first(){
        System.out.println("i am first number ....");
    }
}

class secondclass extends firstclass{
     String name;
   public void second(String name){
    System.out.println("my name is:"+name);
   }   
}


public class Singleinherit {
    public static void main(){
        //create a object
    secondclass obj=new secondclass();
    obj.first();
    obj.second("pratap");
    }
}
