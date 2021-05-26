/**
 * prac
 */
public class prac {

    public static void main(String[] args) {
        int a[] = { 3, 4, 1, 4, 5, 5, 6, 19, 43, 43 };
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for (int item : a) {
            System.out.print(item + " ");
        }
    }
}