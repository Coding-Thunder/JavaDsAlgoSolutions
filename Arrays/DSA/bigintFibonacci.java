package Arrays.DSA;

import java.math.BigInteger;
import java.util.Scanner;

public class bigintFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i < n; i++) {
            BigInteger c = a.add(b);
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
