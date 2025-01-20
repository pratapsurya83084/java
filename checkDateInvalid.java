// Custom Exception class
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

// MyDate class
class checkDateInvalid {
    private int day, month, year;

    public checkDateInvalid(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to validate the date and throw an exception if invalid
    public void validate() throws InvalidDateException {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
        }
    }

    // Method to display the date
    public void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    // Main method to run the program
    public static void main(String[] args) {
        checkDateInvalid date = new checkDateInvalid(37, 5, 2023); // Invalid day (32)

        try {
            date.validate();  // Validate date
            date.display();   // Display date if valid
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());  // Catch and display the exception
        }
    }
}
