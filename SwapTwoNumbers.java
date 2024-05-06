package Questions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x=10;
		int y=50;
		System.out.println("Before swaping x="+x+" y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
//		x=x^y;
//		y=x^y;
//		x=x^y;
		System.out.println("after swaping x="+x+" y="+y);

	}

}
