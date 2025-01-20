// class Animal {
//     // final int age;
//     // Declare a final method
//     public  void sound(int age) {
//         System.out.println("Animal makes a sound:"+age);
//     }
// }

// class Dog extends Animal {
//     // Trying to override the final method will result in an error
//     String name;
 
//     public void souxnd(String name) {
//           this.name=name;

//         System.out.println("Dog barks:"+name);
//     }
// }

// public class finalkeyword{
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.sound(2);  // Calls the final method from the parent class
//     dog.souxnd("pratap");
//     }
// }


class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class fin{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Outputs: Dog barks
    }
}
