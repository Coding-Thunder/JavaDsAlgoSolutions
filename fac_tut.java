import java.util.Scanner;

public class fac_tut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        sc.close();

        for (int i = n; i >= 1; i--) {
            answer = answer * i;
        }
        System.out.println("the factorial of " + n + " is " + answer);
    }
}
