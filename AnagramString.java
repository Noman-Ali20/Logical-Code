package Questions;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1="silent";
		String str2="lsinte";
		
		if(Arm(str1,str2)) {
			System.out.println("It is Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}

	private static boolean Arm(String str1, String str2) {
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);

	}

}
