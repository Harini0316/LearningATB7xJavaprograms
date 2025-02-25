package ex14102024;

public class ReverseWords1 {
    public static void main(String[] args) {
        String input = "Harini Chandrasekar";
        String reversed = reverseWords(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(reverseString(word)).append(" ");
        }

        return result.toString().trim();
    }

    public static String reverseString(String word) {
        char[] chars = word.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
