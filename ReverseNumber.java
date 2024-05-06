package Questions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+" <--> ");
		int rev,dig;
		while(n>0) {
			dig=n%10;
			rev=dig; 
			System.out.print(rev);
			n=n/10;
		}
		

	}

}
