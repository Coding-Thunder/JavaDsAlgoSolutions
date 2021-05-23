import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}