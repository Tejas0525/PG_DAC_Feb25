public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 22, 9, 35, 5};

        // Initialize smallest and largest with the first element
        int smallest = numbers[0];
        int largest = numbers[0];

        // Loop through the array to find smallest and largest
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num; // Update smallest
            }
            if (num > largest) {
                largest = num; // Update largest
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
