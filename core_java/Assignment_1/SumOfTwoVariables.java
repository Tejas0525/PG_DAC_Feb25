import java.util.*;
class SumOfTwoVariables{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum= num1+num2;

		System.out.println("Sum = " + sum);
	}
}