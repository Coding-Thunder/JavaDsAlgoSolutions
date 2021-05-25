package Assignment;

import java.util.Scanner;

public class sumOfNumberOfDigitsForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int sum = 0;
        int len = (int) Math.log10(n) + 1;
        for (int i = 1; i <= len; i++) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(sum);
    }
}
