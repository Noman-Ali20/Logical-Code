package Questions;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 4, 3, 8};
	    
	    for (int i = 0; i < arr.length; i++) { // Loop over java Array  outer Loop use
	      for (int j = i + 1; j < arr.length; j++) { // Loop over java array
	        int tmp = 0; // tempraory variable in order to compare.
	        if (arr[i] > arr[j]) { // compare outer loop object with inner loop
	          tmp = arr[i]; // if greater than swapping.
	          arr[i] = arr[j]; // Swaping code here.
	          arr[j] = tmp;
	        }
	      }
	    }
	    // After Sorting Printing The Value.............

	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i]+" ");
	    }
		
	}

}
