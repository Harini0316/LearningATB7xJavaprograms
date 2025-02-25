package ex14102024;

public class AlphabetCount {
    public static void main(String[] args) {
        String str = "Bonobonoya".toLowerCase(); // Convert to lowercase for case insensitivity
        int[] count = new int[26]; // Array to store frequency of each letter

        // Counting frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        // Printing frequency
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + count[i]);
            }
        }
    }
}
