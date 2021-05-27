package StringPractice;

public class checkAnagramOptimized {
    public static void main(String[] args) {
        String a = "*#*";
        String b = "*#";
        boolean isAnagram = true;
        int al[] = new int[256];

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
            System.out.println("It's No Anagram");
        }
    }
}
