package Arrays;

import java.util.Scanner;

public class matricesMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows == cols) {
            int a[][] = new int[rows][cols];
            int b[][] = new int[rows][cols];
            int c[][] = new int[rows][cols];

            // Taking First Array Through User Input
            System.out.println("Enter First Array");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.println("Enter Next Eliment");
                    a[i][j] = sc.nextInt();
                }
            }

            // Taking Second Array Through User Input
            System.out.println("Enter Second Array");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.println("Enter Next Eliment");
                    b[i][j] = sc.nextInt();
                }
            }

            sc.close();

            // Doing Multiplication of Matrcices And Storing Them Into C Matric
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    c[i][j] = a[i][j] * b[j][i];
                }
            }

            // Print The Array
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.println(c[i][j]);
                }
            }
        } else {
            System.out.println("Cannot Multiply,Length of Rows And Columns Should Be Equal");
        }
    }
}
