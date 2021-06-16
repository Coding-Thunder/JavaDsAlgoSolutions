package StringPractice;

/**
 * nthTermOfGP
 */
import java.util.Scanner;

public class nthTermOfGP {
    public static int nthTermOfGP(int a, int x, int n) {
        int ans = a * (int) (Math.pow(x, n - 1));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a * r ** (n - 1)
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int nthTerm = nthTermOfGP(a, d, n);
        System.out.println(nthTerm);
    }
}