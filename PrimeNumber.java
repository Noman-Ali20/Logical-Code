package questions;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		int count = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime.");
		} else {
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(num + " is not prime.");
			} else {
				System.out.println(num + " is prime.");
			}

		}
	}
}
