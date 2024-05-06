package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class FourthLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 16, 16, 16};
        int fourthLargest = findFourthLargest(arr);
        System.out.println("Fourth Largest Element: " + fourthLargest);
    }

    public static int findFourthLargest(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Find the number of unique elements
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Step 3: Determine the fourth largest element
        if (uniqueCount < 4) {
            System.out.println("Input array doesn't have at least four unique elements.");
            return -1; // Return -1 if there are less than four unique elements
        } else {
            int fourthLargest = arr[uniqueCount - 4];
            return fourthLargest;
        }
    }
}