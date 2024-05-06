package Questions;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,5,19,1};
		int smallNum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(smallNum>arr[i]) {
				smallNum=arr[i];
			}
		}
		System.out.println("Smallest Number in array is:"+smallNum);
		
			}

}
