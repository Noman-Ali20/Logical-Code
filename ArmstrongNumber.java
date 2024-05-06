package Questions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int temp,dig,sum=0;
		//153
		temp=n;
		while(n>0) {
			dig=n%10;//3  5 1
			sum=sum +(dig*dig*dig); 
			n=n/10; //0
		}
		if(temp==sum)
			System.out.println(temp+" is armstrong number");
		else
			System.out.println(temp+" is not armstrong number");

	}

}
