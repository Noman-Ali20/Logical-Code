package Questions;
public class DistinctCharactersAndCount2 {

    public static void main(String[] args) {
        String str = "Hey World";
        str = str.replaceAll(" ", "");

        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }

        // Print the counts in the order of appearance
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character has been processed
            if (charCount[c] != 0) {
                System.out.println("Character: " + c + " count: " + charCount[c]);

                // Mark the character as processed
                charCount[c] = 0;
            }
        }
    }
}
