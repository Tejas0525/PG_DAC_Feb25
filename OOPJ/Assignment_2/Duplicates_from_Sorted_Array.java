public class  Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        System.out.println("Duplicates from a Sorted Array..");

        int num[] = { 1, 1, 3, 5, 5 };

        System.out.println("Before Deletion of Elements in Array : ");
        for (int i : num) {
            System.out.print(i + " ");
        }

        int n = num.length;

        for (int j = 0; j < n-1; j++) {
            if(num[j] == num[j+1])
            {
                num[j] = 0;
            }
        }

        System.out.println("Before Deletion of Elements in Array : ");
        for (int i = 0; i < n; i++) {
            if(num[i] != 0)
            {
                System.out.print(num[i] + " ");
            }
        }
    }
}
