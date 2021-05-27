package StringPractice;

public class checkAnagram {
    public static void main(String[] args) {
        String word1 = "aab";
        String word2 = "abc";
        boolean isAnagram = false;
        boolean visited[] = new boolean[word2.length()];

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                char c = word1.charAt(i);
                isAnagram = false;
                for (int j = 0; j < word2.length(); j++) {
                    if (word2.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if (isAnagram) {
            System.out.println("Yes its anagram");
        } else {
            System.out.println("it's not anagram");
        }
    }
}
