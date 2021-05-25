package DoWhileLoop;

import java.util.Scanner;

public class doWhileLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        do {
            n = sc.nextInt();
            sc.close();
            System.out.println("n is " + n);
        } while (n != 0);
    }
}
