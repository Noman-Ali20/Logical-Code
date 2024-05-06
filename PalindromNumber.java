package Questions;

public class PalindromNumber {

	public static void main(String[] args) {
		int n = 101,dig,temp,sum=0;
	    temp=n;
		while(n>0) {
			dig=n%10;
			sum=(sum*10)+dig;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Palindrom");
		else
			System.out.println("not palindrom");
		
	}

}
