
/**
 * prac
 */

import java.util.Scanner;

public class prac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows and columns and both should same");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows == cols) {
            int a[][] = new int[rows][cols];
            int b[][] = new int[rows][cols];
            int c[][] = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    c[i][j] = a[i][j] * a[j][i];
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(c[i][j] + " ");
                }
            }

        } else {
            System.out.println("Length of Rows and Columns should be equal");
        }
    }
}