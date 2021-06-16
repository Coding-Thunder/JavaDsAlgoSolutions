package StringPractice;

import java.util.Scanner;

public class findTheNthTermOfAP {
    public static int nthTerm(int a, int d, int n) {
        int ans = a + (n - 1) * d;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a+(n-1)*d
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int nthTermOfAp = nthTerm(a, d, n);
        System.out.println(nthTermOfAp);
    }
}
