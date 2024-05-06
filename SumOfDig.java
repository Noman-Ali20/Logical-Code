package Questions;

import java.util.Scanner;

public class SumOfDig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt(),sum=0,dig;
		while(n>0) {
			dig=n%10;
			sum=sum+dig;
			n=n/10;
		}
		System.out.println("Sum of digit :"+sum);

	}

}
