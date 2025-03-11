import java.util.Scanner;

class Array2d{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[][] arr =new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Enter elements:");
		
		for(int[] i:arr){
			for(int j:i){
				i[j]=sc.nextInt();
				
			}
			sc.nextLine();
		}
		
		//System.out.println("Printing elements:");
		
		for(int[] i:arr){
			for(int j:i){
				System.out.print(i[j] + " ");
			}
			System.out.println();
		}
		
		
	
	}

}