
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}