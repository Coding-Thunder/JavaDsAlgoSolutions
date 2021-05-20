
import java.util.Scanner;

/**
 * HelloWorld
 */
public class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        float num1 = sc.nextFloat();

        System.out.println("Enter second number");
        float num2 = sc.nextFloat();

        System.out.println("Enter the operation");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);
        sc.close();

        float result = 0f;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            default:
                System.out.println("Invalid Operation");
        }
        System.out.println("the result is " + result);
    }

}