package Questions;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number: ");
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime==true)
				System.out.print(i+" ");
		}

		
	}

}









































