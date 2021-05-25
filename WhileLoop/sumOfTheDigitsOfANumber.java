package WhileLoop;

import java.util.Scanner;

public class sumOfTheDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp /= 10;
            sum += lastDigit;
        }

        System.out.println("The Sum of the digits of " + n + " is " + sum);
    }
}
