package Questions;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int n = 13;

		int c = 0;
		if (n == 0 || n == 1) {
			System.out.println(n + " is prime");
		} else {
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					c++;
				}

			}
			if (c > 1) {
				System.out.println(n + " is not prime.");
			} else {
				System.out.println(n + " is prime.");
			}
		}
		

	}

}
