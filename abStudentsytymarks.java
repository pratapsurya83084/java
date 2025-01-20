import symark.SYMarks;
import tymark.TYMarks;

public class abStudentsytymarks {

    
    private int rollNumber;
    private String name;
    private SYMarks syMarks;
    private TYMarks tyMarks;

    public abStudentsytymarks(int rollNumber, String name, SYMarks syMarks, TYMarks tyMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

   
    public int getTotalComputerMarks() {
        return syMarks.getComputerTotal() + tyMarks.getComputerTotal();
    }

   //using comdition give grade
    public String calculateGrade() {

        int totalMarks = getTotalComputerMarks();
        if (totalMarks >= 70) {
            return "A";
        } else if (totalMarks >= 60) {
            return "B";
        } else if (totalMarks >= 50) {
            return "C";
        } else if (totalMarks >= 40) {
            return "Pass Class";
        } else {
            return "FAIL";
        }
    }

   
    public void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total Computer Marks (SY + TY): " + getTotalComputerMarks());
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
       
        SYMarks sy1 = new SYMarks(25, 30, 35);
        TYMarks ty1 = new TYMarks(30, 20);

        abStudentsytymarks student1 = new abStudentsytymarks(1, "John Doe", sy1, ty1);
        student1.displayResult();

       
        SYMarks sy2 = new SYMarks(35, 30, 40);
        TYMarks ty2 = new TYMarks(40, 25);

        abStudentsytymarks student2 = new abStudentsytymarks(2, "Jane Doe", sy2, ty2);
        student2.displayResult();
   
    }
}