package questions;

public class PerfectNumber {

	public static void main(String[] args) {
		// if sum of factors = product of factors, it is perfect number
		int n=6, sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) //product
			sum=sum+i;
		}
		if(sum==n)
			System.out.println("It is perfect Number");
		else
			System.out.println("It is Not perfect Number");
	}

}
