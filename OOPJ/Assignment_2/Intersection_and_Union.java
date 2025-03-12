import java.util.Arrays;

public class Intersection_and_Union {
    public static void main(String[] args) {
        System.out.println("Intersection and Union of Two Arrays..");

        int a[] = { 1, 5, 7, 3, 6 };
        int b[] = { 6, 2, 3 };

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;

        int union[] = new int[m + n];
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                union[k] = a[i];
                k++;
                i++;
            } else if (b[j] < a[i]) {
                union[k] = b[j];
                j++;
                k++;
            } else {
                union[k] = a[i];
                k++;
                i++;
                j++;
            }
        }

        while (i < n) {
            union[k++] = a[i++];
        }
        while (j < m) {
            union[k++] = b[j++];
        }

        System.out.println("Union of Two Arrays ");
        for (int in = 0; in < union.length; in++) {
            if (union[in] != 0) {
                System.out.print(union[in] + " ");
            }
        }

        // Intersection

        i = 0;
        j = 0;
        k = 0;
        int intersection[] = new int[m + n];

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                intersection[k] = a[i];
                i++;
                j++;
                k++;
            }
        }

        System.out.println("\nIntersection of Two Arrays ");
        for (int in = 0; in < intersection.length; in++) {
            if (intersection[in] != 0) {
                System.out.print(intersection[in] + " ");
            }
        }

    }
}
