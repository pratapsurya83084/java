
class firstclass{
    public void  first(){
          System.out.println("i am a first base class");

    }
}



class secondclass extends firstclass{
    public void  second(){
        System.out.println("i am a sencond base class");

    }
}



class thirdclass extends secondclass{
    public void  third(){

        System.out.println("i am a third base class");
    }
}



 class multipleinheritance {
    public static void main(String[] args){
    

        thirdclass obj= new thirdclass();
        obj.first();
        obj.second();
        obj.third();


    }
}


