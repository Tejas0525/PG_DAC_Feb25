import java.util.*;
class MultiplyTwoNumbers{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int mult=num1*num2;

		System.out.println("multiplication of two numbers is "+ mult);
	}
}