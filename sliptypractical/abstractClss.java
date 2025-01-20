// Abstract class Staff
abstract class Staff {
    int id;
    String name;

    // Abstract method (no body)
    abstract void displayDetails();
}

// Subclass OfficeStaff that extends the abstract class
class OfficeStaff extends Staff {
    
    // Constructor to initialize id and name
    OfficeStaff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implementing the abstract method
    void displayDetails() {
        System.out.println("The name is: " + name + ", The id is: " + id);
    }
}

 class abstractClss {
    public static void main(String[] args) {
        // Creating an object of OfficeStaff and passing id and name via constructor
        OfficeStaff obj = new OfficeStaff(20, "Pratap");
        
        // Calling the displayDetails method to print the details
        obj.displayDetails();
    }
}
