// public 5.Define an abstract class Staff with protected members id and name. Define a parameterized constructor. Define one subclass Office Staff with member department. Create n objects of Office Staff and display all details.

abstract class Staff {
    protected int id;
    protected String name;
    // Parameterized constructor
    public Staff(int id, String name) {
   this.id = id;
    this.name = name;
    }
    // Abstract method to display details
    public abstract void displayDetails();
    }
    // Subclass OfficeStaff
    class OfficeStaff extends Staff {
    private String department;
    // Parameterized constructor
    public OfficeStaff(int id, String name, String department) {
    super(id, name);
    this.department = department;
    }
    // Override displayDetails method
    @Override
    public void displayDetails() {
    System.out.println(" ID: " + id);
    System.out.println(" Name: " + name);
    System.out.println(" Department: " + department);
    System.out.println();
    }
    }
    public class Main {
    public static void main(String[] args) {
    // Create OfficeStaff object
    OfficeStaff staff = new OfficeStaff(1, "John Doe", "HR");
    // Display details
    staff.displayDetails();
    }
    }