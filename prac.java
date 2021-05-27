/**
 * prac
 */
public class prac {

    public static void main(String[] args) {
        String a = "#!a";
        String b = "a#!";
        int al[] = new int[256];
        boolean isAnagram = true;

        for (char c : a.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }

        for (char c : b.toCharArray()) {
            int index = (int) c;
            al[index]--;
        }

        for (int i = 0; i < 256; i++) {
            if (al[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("It's Anagram");
        } else {
            System.out.println("It's Not Anagram");
        }
    }
}