import java.util.Scanner;

public class improved_prime_number_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (n < 2) {
            isPrime = false;
        }
        System.out.println(isPrime);

    }
}
