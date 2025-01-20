import java.util.Scanner;

class transposeMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix dimension");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("enter matrix elements : ");
        for (int i = 0; i < n; i++) {
            // System.out.println(" ");
            for (int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();

            }

        }

        // display matrix array 2d
        System.out.println("your matrix is :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println(" ");
        }

        // after changing the 2d matrix
        System.out.println("after changing the row and column : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 System.out.print("\t"+ matrix[j][i]);
            }
            System.out.println(" ");
        }

    }
}
