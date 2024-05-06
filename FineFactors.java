package Questions;

public class FineFactors {

	

		public static void main(String[] args) {
			 int number = 75;
		        System.out.println("Factors of " + number + " are:");
		        printFactors(number);
		    }

		    public static void printFactors(int number) {
		        for (int i = 1; i <= number; i++) {
		            if (number % i == 0) {
		                System.out.print(i);
		                if (i != number) {
		                    System.out.print(", ");
		                }
		            }
		        }
		    }

	}

