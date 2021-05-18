/**
 * ForLoopPratice
 */
public class ForLoopPratice {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i = i + 1) {
            System.out.println("hello world");
        }

        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }

        // ARITHMETIC PROGRESSION PROBLEM
        int sum = 0;
        int n = 50;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // REVERSE COUNT PROBLEM

        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }

        // TABLE OF 4
        int tableOf = 120;
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf * i);
        }

    }
}