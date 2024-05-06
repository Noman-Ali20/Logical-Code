package questions;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		int limit = 100;
		for (int i = 1; i <= limit; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}

		}

	}

}
