package Questions;

public class CheckVovelPresent {

	public static void main(String[] args) {
		String str = "HelloHi";
		str=str.toLowerCase();
		int c=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				c++;
			}
		}
		if(c>0)
			System.out.println("vovel present");
		else
			System.out.println("vovel not present");

	}

}
