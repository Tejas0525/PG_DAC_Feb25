public class Rotate_an_Array {
    public static void main(String[] args) {
        System.out.println("Rotate an Array..");

        int num[] = { 1, 2, 3, 4, 5 };

        System.out.println("Before Rotation Array : ");
        for (int i : num) {
            System.out.print(i + " ");
        }

        int n = num.length;
        int ans[] = new int[n];
        int k = 2;

        for (int i = 0; i < n; i++) {
            ans[(i + k) % n] = num[i];
        }

        System.out.println("\nAfter Rotation Array : ");
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
