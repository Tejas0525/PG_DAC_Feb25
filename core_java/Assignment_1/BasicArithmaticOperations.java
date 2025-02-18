import java.util.*;
class BasicArithmaticOperations{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		int sum= num1+num2;
		int sub= num1-num2;
		int mult= num1*num2;
		int div= num1/num2;
		int rem= num1%num2;

		System.out.println("Sum= "+ sum);
		System.out.println("Subtraction= "+sub);
		System.out.println("Multiplication= "+ mult);
		System.out.println("Division= "+ div);
		System.out.println("Remainder" + rem);
	}
}