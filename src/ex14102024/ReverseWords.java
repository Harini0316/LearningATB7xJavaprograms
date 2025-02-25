package ex14102024;

    public class ReverseWords {
        public static void main(String[] args) {
            String input = "Harini Chandrasekar";
            String reversed = reverseWords(input);
            System.out.println("Reversed String: " + reversed);
        }

        public static String reverseWords(String str) {
            String[] words = str.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                result.append(new StringBuilder(word).reverse()).append(" ");
            }

            return result.toString().trim();
        }
    }
