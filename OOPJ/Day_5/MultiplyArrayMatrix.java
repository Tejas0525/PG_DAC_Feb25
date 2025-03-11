
import java.util.Scanner;

class MultiplyArrayMatrix{
	
	static int[][] multiply(int[][] arr){
		
		for(int[][] i:arr){
			for(int[] j:i){
				for(int q:j){
				
				mult=arr[i]*arr[j];
				arr[q]=mult;
				
			}
		}
		return arr;
	}
	
	
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
			int arr[][] = new int[3][3];
			
			System.out.println("Enter elements: ");
			for(int[] i : arr){
				for(int[] j: i){
					for(int q:j){
					
						j[q]=sc.nextInt();
					}
				}
			}
			
			int [][]result = multiply(arr);
			
			System.out.println("Multiplied array: ");
			for(int[][] i:result){
				for(int[] j:i){
					for(int q:j){
					
					System.out.println(arr[q]);
					}
				}
			}
			
	}
}