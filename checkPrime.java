import java.util.Scanner;

// Custom Exception class for number zero
class NumberIsZeroException extends Exception {

    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class checkPrime {
    // Static method to check if a number is prime

    public static boolean isPrime(int num) {
       
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();

        try {
            // Check if the number is zero
            if (number == 0) {
                throw new NumberIsZeroException("Number is 0");
            }
            
            // Check if the number is prime
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (NumberIsZeroException e) {
            // Handle the custom exception
            System.out.println(e.getMessage());
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
