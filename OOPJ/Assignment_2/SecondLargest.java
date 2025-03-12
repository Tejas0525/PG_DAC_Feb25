public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99};

        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find largest and second largest
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num; // Update second largest
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
