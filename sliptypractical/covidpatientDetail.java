// display details of patients and check oxygenlevel is less than 95% then throw exception
 

// Custom exception class
class UserDefinedException extends Exception {
    public UserDefinedException(String message) {
        super(message);
    }
}

class Patient {
    String name;
    int age;
    int oxygenLevel;
    int hcrtReport;

    Patient(String name, int age, int oxygenLevel, int hcrtReport) {
        this.name = name;
        this.age = age;
        this.oxygenLevel = oxygenLevel;
        this.hcrtReport = hcrtReport;
    }

    void displayDetails() throws UserDefinedException {
        if (oxygenLevel < 95 || hcrtReport > 10) {
            throw new UserDefinedException("Patient needs to go to the hospital");
        } else {
            System.out.println("Name: " + name + ", Age: " + age +
                    ", Oxygen Level: " + oxygenLevel + ", Hcrt Report: " + hcrtReport);
        }
    }
}

public class covidpatientDetail {
    public static void main(String[] args) {
        Patient patient1 = new Patient("KK", 30, 96, 9);
        // Patient patient2 = new Patient("Omkar", 45, 80, 12);

        try {
            patient1.displayDetails(); // Should display details
          
        } catch (UserDefinedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


