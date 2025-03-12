public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse the array in place
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            // Swap the elements at start and end
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            // Move pointers
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
