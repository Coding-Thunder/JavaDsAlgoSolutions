
/**
 * series_sum_2
 */
import java.util.Scanner;

public class series_sum_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        float result = 0;
        for (float i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                result -= 1 / i;
            } else {
                result += 1 / i;
            }
        }
        System.out.println(result);
    }
}