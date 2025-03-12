public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        int sum = 0;

        // Loop through the array to calculate the sum
        for (int num : numbers) {
            sum += num; // Add each element to sum
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
