package Questions;

public class NumberToWord1 {

	public static void main(String[] args) {
		String str = " ";
		int n = 240;
		while (n > 0) {
			int dig = n % 10;
			switch (dig) {
			case 0:
				str = "zero" + str;
				break;
			case 1:
				str = "one" + str;
				break;
			case 2:
				str = "two" + str;
				break;
			case 3:
				str = "three" + str;
				break;
			case 4:
				str = "four" + str;
				break;
			case 5:
				str = "five" + str;
				break;
			case 6:
				str = "six" + str;
				break;
			case 7:
				str = "seven" + str;
				break;
			case 8:
				str = "eight" + str;
				break;
			case 9:
				str = "nine" + str;
				break;
			default:
				System.out.println("invalid number");

			}
			n = n / 10;

		}

		System.out.println("word: " + str);

	}

}
