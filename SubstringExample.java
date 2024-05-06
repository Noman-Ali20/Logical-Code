package Questions;

public class SubstringExample {

	public static void main(String[] args) {
		String original = "Hello, World!";

		// Using substring(int beginIndex)
		String substring1 = original.substring(7);
		System.out.println(substring1); // Outputs "World!"

		// Using substring(int beginIndex, int endIndex)
		String substring2 = original.substring(0, 5);
		System.out.println(substring2); // Outputs "Hello"

	}

}
