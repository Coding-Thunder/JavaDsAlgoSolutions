package Assignment;

/**
 * pattern_Question_6
 */
import java.util.Scanner;

public class pattern_Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");

            }
            if (i <= n)
                System.out.print("1 ");
            int number = 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(number + " " + (number + 1) + " ");
            }

            System.out.println();
        }
    }
}