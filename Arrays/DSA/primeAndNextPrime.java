package Arrays.DSA;

import java.math.BigInteger;
import java.util.Scanner;

public class primeAndNextPrime {

    public static BigInteger isNextPrime(BigInteger num) {
        BigInteger one = BigInteger.valueOf(1);
        BigInteger zero = BigInteger.valueOf(0);
        BigInteger two = BigInteger.valueOf(2);
        num = num.add(one);
        while (num.remainder(two) != zero) {
            num = num.add(one);
        }
        return num;
    }

    public static boolean checkIfPrime(BigInteger num) {
        BigInteger zero = BigInteger.valueOf(0);
        BigInteger two = BigInteger.valueOf(2);
        if (num.remainder(two) == zero)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        BigInteger n2 = BigInteger.valueOf(n);
        System.out.println(checkIfPrime(n2));
        System.out.println(isNextPrime(n2));
    }
}
