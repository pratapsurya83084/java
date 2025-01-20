import java.util.Scanner;

public class transposeMatrix {

    // Method to print a matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Input elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix, rows, cols);

        // Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(matrix, rows, cols);

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix (Rows and Columns Swapped):");
        printMatrix(transposedMatrix, cols, rows);

        sc.close();
    }
}
