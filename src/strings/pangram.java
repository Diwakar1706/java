package strings;

public class pangram {

    public static boolean checkIfPangram(String sentence) {

        int[] freq = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int ind = ch - 'a';
                freq[ind]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = checkIfPangram(sentence);

        System.out.println("Is Pangram? " + result);
    }
}