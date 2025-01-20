import java.util.Scanner;

public class menuDriven {

    // Method to add two matrices
    public static void addMatrices(int[][] mat1, int[][] mat2, int rows, int cols) {
        System.out.println("Matrix Addition:");
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to multiply two matrices
    public static void multiplyMatrices(int[][] mat1, int[][] mat2, int rows, int cols) {
        System.out.println("Matrix Multiplication:");
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Input matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        
        System.out.println("Enter elements of matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        while (true) {
            // Menu
            System.out.println("\n1. Add Matrices");
            System.out.println("2. Multiply Matrices");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Addition of matrices
                    addMatrices(matrix1, matrix2, rows, cols);
                    break;

                case 2:
                    // Multiplication of matrices
                    multiplyMatrices(matrix1, matrix2, rows, cols);
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
