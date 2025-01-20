// Base class: Shape
class Shape {
    public double area() {
        // Default implementation, can be overridden by subclasses
        return 0;
    }
}

// Derived class: Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the area() method to calculate the area of a circle
    @Override
    public double area() {
        double pi=3.14;
        return  pi* radius * radius;
    }
}

public class areaofcirc{
    public static void main(String[] args) {
        // Create a Circle object with a specific radius
        Circle circle = new Circle(5.0);

        // Call the area method and display the result
        System.out.println("The area of the circle is: " + circle.area());
    }
}
