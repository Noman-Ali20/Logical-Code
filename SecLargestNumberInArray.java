package Questions;
public class SecLargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {15, 5,20,19};

        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}
