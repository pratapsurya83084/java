public class bms {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide first name, last name, weight (in kg), and height (in meters).");
            return;
        }

        // Read command line arguments
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]); // Weight in kg
        double height = Double.parseDouble(args[3]); // Height in meters

        // Calculate BMI (BMI = weight / (height * height))
        double bmi = weight / (height * height);

        // Output the result
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " meters");
        System.out.printf("BMI: %.2f\n", bmi); // Print BMI with 2 decimal places
    }
}
