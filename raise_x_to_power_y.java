
/**
 * prac
 */
import java.util.Scanner;

public class raise_x_to_power_y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Raise x to power y
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter power to raise to");
        int y = sc.nextInt();
        sc.close();
        float result = 1f;
        for (float i = 0; i < y; i++) {
            result *= x;
        }
        System.out.println(result);
    }

}