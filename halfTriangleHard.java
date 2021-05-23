import java.util.Scanner;

public class halfTriangleHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();

        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= range - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
