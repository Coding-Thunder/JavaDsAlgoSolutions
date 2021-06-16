package Arrays;

import java.util.Scanner;

public class sumOfNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sumOfN = (n * (n + 1)) / 2;
        System.out.println(sumOfN);
    }
}
