import java.util.Scanner;
class MaxElementMatrix{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		int ary[][]= new int[2][2];
		System.out.println("Enter the Elements");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				ary[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(ary[i][j]+"");
			}
			System.out.println();
		}

		int max=ary[0][0];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				if(max<ary[i][j]){
					max=ary[i][j];
				}
			}
		}
		System.out.println("Maximum value is "+max);
	}
}