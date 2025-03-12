public class Missing_Number_in_an_Array {
    public static void main(String[] args) {
        
        System.out.println("Missing Number in an Array..");

        int num[] = {1, 2, 4, 5, 6};

        int n = num.length;
        int totalSum = 0;
        for(int i = 1; i <= n+1; i++){
            totalSum += i;
        }
        
        for(int i = 0; i < n; i++){
            totalSum -= num[i];
        }

        System.out.println("Missing Number : "+totalSum);
    }
}
