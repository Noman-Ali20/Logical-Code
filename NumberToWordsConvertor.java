package Questions;

public class NumberToWordsConvertor {

	private static final String[] BELOW_TWENTY = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private static final String[] TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static void main(String[] args) {
		int number = 204;
		String words = convertNumberToWords(number);
		System.out.println("Words representation: " + words);
	}

	public static String convertNumberToWords(int number) {
		if (number == 0) {
			return "Zero";
		}

		StringBuilder result = new StringBuilder();

		int hundredsDigit = number / 100;
		int tensDigit = (number % 100) / 10;
		int onesDigit = number % 10;

		if (hundredsDigit > 0) {
			result.append(BELOW_TWENTY[hundredsDigit]).append(" Hundred ");
		}

		if (tensDigit >= 2) {
			result.append(TENS[tensDigit]).append(" ");
			if (onesDigit > 0) {
				result.append(BELOW_TWENTY[onesDigit]).append(" ");
			}
		} else if (tensDigit == 1) {
			result.append(BELOW_TWENTY[number % 100]).append(" ");
		} else if (onesDigit > 0) {
			result.append(BELOW_TWENTY[onesDigit]).append(" ");
		}

		return result.toString();
	}
}
