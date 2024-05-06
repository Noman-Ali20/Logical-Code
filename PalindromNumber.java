package questions;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 121, rev=0, temp, dig;
		temp=num;
		
		while(num>0) {
			dig=num%10;
			rev=(rev*10)+dig;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("Number is palindrom");
		else
			System.out.println("Number is Not palindrom");
	}

}
