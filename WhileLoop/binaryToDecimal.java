package WhileLoop;

public class binaryToDecimal {
    public static void main(String[] args) {
        String st = "1010";
        int m = 0;
        int k = 1;
        for (int i = st.length() - 1; i >= 0; i--) {
            m += (st.charAt(i) - '0') * k;
            k = k * 2;
        }
        System.out.println(m);
    }
}
