package Assignment;

import java.util.Scanner;

public class pattern_Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int rows = 2 * n - 1;
        for (int i = 1; i <= rows; i += 2) {

            for (int j = 1; j <= rows - i - 1; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
