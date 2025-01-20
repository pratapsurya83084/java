import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
// Attributes of the Student class
private String rollNo;
private String name;
private String studentClass;
private double percentage;
// Constructor
public Student(String rollNo, String name, String studentClass, double percentage) {
this.rollNo = rollNo;
this.name = name;
this.studentClass = studentClass;
this.percentage = percentage;
}
// Method to display student information
public void displayInfo() {
System.out.println(" Roll Number: " + rollNo);
System.out.println("Name: " + name);
System.out.println("Class: " + studentClass);
System.out.println("Percentage: " + percentage);
}
// Main method to read input and create a Student object
public static void main(String[] args) {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try {
// Read student information from console
System.out.print("Enter Roll Number: ");
String rollNo = reader.readLine();
System.out.print("Enter Name: ");
String name = reader.readLine();
System.out.print("Enter Class: ");
String studentClass = reader.readLine();
System.out.print("Enter Percentage: ");
double percentage = Double.parseDouble(reader.readLine());
// Create a Student object
Student student = new Student(rollNo, name, studentClass, percentage);
// Display student information
student.displayInfo();
} catch (IOException e) {
System.out.println("An error occurred while reading input.");
e.printStackTrace();
} catch (NumberFormatException e) {
System.out.println("Invalid input for percentage.");
e.printStackTrace();
}
}
}