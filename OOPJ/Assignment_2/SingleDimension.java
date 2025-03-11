import java.util.Scanner;

class SingleDimension{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		System.out.println("Enter elements:");
		for(int i:arr){
			arr[i]=sc.nextInt();
		}
		sc.nextLine();
		int evenCount=0;
		int oddCount=0;
		int multCount=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				evenCount++;
			}
			if(arr[i]%2!=0){
				oddCount++;
			}
			if(arr[i]%3==0){
				multCount++;
			}
		}
		System.out.println("Even count: "+ evenCount);
		System.out.println("Odd count: "+ oddCount);
		System.out.println("multCount: "+ multCount);
	}
}