package questions;
import java.util.Scanner;

public class takeInput {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first num : ");
		a=sc.nextInt();
		System.out.print("enter second num : ");
		b=sc.nextInt();
        System.out.println("Sum of "+a+ " and "+b+" is = "+a+b);
	}

}
