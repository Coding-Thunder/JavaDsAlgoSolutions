package StringPractice;

public class practice {
    public static void main(String[] args) {
        String inp = "abcdefg";
        String b = "";
        int len = inp.length() - 1;
        while (len >= 0) {
            b = b + inp.charAt(len);
            len--;
        }
        System.out.println(inp == b);
    };

}
