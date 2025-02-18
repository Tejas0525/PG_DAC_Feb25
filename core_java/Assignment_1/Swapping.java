import java.util.*;
class Swapping{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Before Swapping:");
		System.out.println("Frist Number: " + num1);
		System.out.println("Second Number: " + num2);

		System.out.println();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;

		
		System.out.println("After Swapping:");
		System.out.println("Frist Number: " + num1);
		System.out.println("Second Number: " + num2);
	}
}