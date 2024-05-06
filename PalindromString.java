package Questions;

public class PalindromString {

	public static void main(String[] args) {
		
		String str = "level";
		int left = 0;
		int right = str.length() - 1; //4

		// Check characters from both ends towards the center
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				break;
			}
			left++;
			right--;

		}

		if(left==right)
			System.out.println("palin");
		else
			System.out.println("not");

	}

}
