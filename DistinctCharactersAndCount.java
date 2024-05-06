package Questions;

public class DistinctCharactersAndCount {

	public static void main(String[] args) {
		String str = "Hello Duniya";
		System.out.println("String is: " + str);
		str = str.replaceAll("\\s", ""); // Remove white spaces

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			// Skip if the character is already counted
			if (currentChar == 0) {
				continue;
			}

			int count = 1; // Count for the current character
			for (int j = i + 1; j < str.length(); j++) {
				if (currentChar == str.charAt(j)) {
					count++;
					// Mark the character as counted
					str = str.substring(0, j) + (char) 0 + str.substring(j + 1);
				}
			}

			// Print only if the character is not counted yet

			if (count > 0) {
				System.out.println(currentChar + ":" + count);
			}

		}

	}
}
