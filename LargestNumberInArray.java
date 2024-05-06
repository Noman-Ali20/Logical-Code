package Questions;

import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int array[] = { 3, 4, 2, 8, 10 };
		 int maxElement = array[0]; // Assume the first element is the maximum

	        // Iterate through the array starting from the second element
	        for (int i = 1; i < array.length; i++) {
	            // Compare the current element with the current maximum
	            if (array[i] > maxElement) {
	                // Update the maximum if the current element is greater
	                maxElement = array[i];
	            }
	        }

	        System.out.println("The largest element in the array is: " + maxElement);
	    }

}
