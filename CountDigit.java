package questions;

public class CountDigit {

	public static void main(String[] args) {
		int n=12345, count=0;
		while(n != 0) {
			n=n/10;     //1234,123,12,1,0
			count++;
		}
		System.out.println("Count is: "+count);

	}

}
