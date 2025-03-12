import java.util.Scanner;
class MatrixSum{
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

		for(int i=0;i<2;i++){
			int sum=0;
			for(int j=0;j<2;j++){
				sum=sum+ary[i][j];
			}
			System.out.println("Sum of row: "+ sum);
		}

		for(int i=0;i<2;i++){
			int sum=0;
			for(int j=0;j<2;j++){
				sum=sum+ary[j][i];
			}
				System.out.println("Sum of column: "+ sum);
		}
	}

}