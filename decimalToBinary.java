
/**
 * series_sum_2
 */
import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        sc.close();
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        System.out.println(binary);
    }
}
