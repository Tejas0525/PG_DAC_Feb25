import java.util.Scanner;
class DialogalSum{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		int ary[][]= new int[3][3];
		System.out.println("Enter the Elements");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				ary[i][j]=sc.nextInt();
			}
		}

		int sum1=0;
		int sum2=0;
		for(int i=0;i<ary.length;i++){
			for(int j=0;j<ary.length;j++){
				if(i==j){
				sum1=sum1+ary[i][j];
				}
				if((i+j)==ary.length-1){
				sum2=sum2+ary[i][j];
				}
			}
		}
		System.out.println("Sum of first diagonal "+sum1);
		System.out.println("Sum of second diagonal "+sum2);
	}
}
