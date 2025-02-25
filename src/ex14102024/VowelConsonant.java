package ex14102024;

public class VowelConsonant {
    public static void main(String[] args) {
        String str = "phosphorescence";
        int length = 0;
        int vowelCount = 0;
        int Consonantcount = 0;

        // Finding string length without length() method
        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.print("Vowels: ");
        int count1 = 0;
        for (int i = 0; i < length; i++) {
            char ch = str.substring(i, i + 1).charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
                vowelCount++;
            }
        }
        System.out.println("Number of vowels:" + vowelCount);

        System.out.print("\nConsonants: ");
        for (int i = 0; i < length; i++) {
            char ch = str.substring(i, i + 1).charAt(0);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                System.out.print(ch + " ");
                Consonantcount++;
            }
        }System.out.println("Number of consonants:" + Consonantcount);
    }
}
