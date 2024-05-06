package questions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153,sum=0, temp, dig;
		temp = n;
		while(n>0)
		{
			dig = n%10;
			sum = sum+(dig*dig*dig);
			n=n/10;
		}
		if (temp == sum)
			System.out.println("It is an Armstrong Number");
		else
			System.out.println("It is not Armstrong Number");
	}

}
