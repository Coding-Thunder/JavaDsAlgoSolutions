
/**
 * prac
 */
import java.util.Scanner;

public class prac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int n = sc.nextInt();
        sc.close();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j - 1; i++) {
                System.out.print("  ");
            }
            for (int i = 1; i <= n - j + 1; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}