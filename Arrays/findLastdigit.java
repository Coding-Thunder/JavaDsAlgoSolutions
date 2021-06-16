package Arrays;

import java.util.Scanner;

public class findLastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int lastDigitOfN = Math.abs(n % 10);
        System.out.println(lastDigitOfN);
    }
}
