package ex_02092024;

import java.util.LinkedHashSet;
import java.util.Set;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {54, -2, 24, 0, -22, 30, -33, -11, 6};

        Set<Integer> negativeSet = new LinkedHashSet<>();
        Set<Integer> nonNegativeSet = new LinkedHashSet<>();

        // Separate negative and non-negative numbers
        for (int num : arr) {
            if (num < 0) {
                negativeSet.add(num);
            } else {
                nonNegativeSet.add(num);
            }
        }

        // Combine sets while maintaining order
        negativeSet.addAll(nonNegativeSet);

        // Convert set back to array
        int index = 0;
        for (int num : negativeSet) {
            arr[index++] = num;
        }

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
