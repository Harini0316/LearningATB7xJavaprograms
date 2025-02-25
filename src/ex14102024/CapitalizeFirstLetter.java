package ex14102024;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        char[] str = "summarize this".toCharArray();

        // Convert first letter to uppercase manually
        if (str[0] >= 'a' && str[0] <= 'z') {
            str[0] = (char) (str[0] - 'a' + 'A');
        }

        // Print the result
        for (char c : str) {
            System.out.print(c);
        }
    }
}
