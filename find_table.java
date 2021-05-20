
/**
 * series_sum_2
 */
import java.util.Scanner;

public class find_table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tableOf = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " X " + i + " = " + tableOf * i);
        }
    }

}
