package Arrays;

import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        if (n == 1)
            isPrime = false;
        if (n == 2 || n == 3)
            isPrime = false;

        if (n % 2 == 0 || n % 3 == 0)
            isPrime = false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("it's prime number");
        } else {
            System.out.println("Fuck it not an prime number");
        }

    }
}
