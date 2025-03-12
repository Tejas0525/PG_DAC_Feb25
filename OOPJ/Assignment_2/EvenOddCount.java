public class EvenOddCount {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30};

        int evenCount = 0, oddCount = 0;

        // Loop through the array and count even and odd numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++; // Increment even count
            } else {
                oddCount++; // Increment odd count
            }
        }

        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}
