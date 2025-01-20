// // First interface
// interface Animal {
//     void eat();
// }

// // Second interface
// interface Bird {
//     void fly();
// }

// // A class that implements both interfaces
// class Bat implements Animal, Bird {
//     @Override
//     public void eat() {
//         System.out.println("Bat is eating insects.");
//     }

//     @Override
//     public void fly() {
//         System.out.println("Bat is flying.");
//     }
// }

//  class multipleinheri{
//     public static void main(String[] args) {
//         Bat bat = new Bat();
//         bat.eat(); // Output: Bat is eating insects.
//         bat.fly(); // Output: Bat is flying.
//     }
// }


interface first{
    void s1();
}

interface second{
    void s2();
}


class third implements  first,second{

    public void s1(){
        System.out.println("s1 method");
    }

    public void s2(){
        System.out.println("s2 method");
    }


    
}



class multipleinheri{
    public static void main(String[] args) {
        third obj = new third();
        obj.s1();
        obj.s2();
    }
}