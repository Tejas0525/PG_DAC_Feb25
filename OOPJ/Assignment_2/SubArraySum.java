class SubarrayWithGivenSum{
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int S = -10;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == S) {
                    System.out.println("Sub-array with sum " + S + " found from index " + i + " to " + j);
                    return;
                }
            }
        }
        System.out.println("No sub-array with sum " + S + " found.");
    }
}
