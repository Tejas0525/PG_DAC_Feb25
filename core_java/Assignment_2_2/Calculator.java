import java.util.*;
class Calculator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
		System.out.print("Select operaton to perform: ");
		int operation = sc.nextInt();
		System.out.println("Enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		switch(operation){
			case 1:
				int add = num1 + num2;
				System.out.println("Answer = " + add);
				break;
			case 2:
				int sub = num1 - num2;
				System.out.println("Answer = " + sub);
				break;
			case 3:
				int mult = num1 * num2;
				System.out.println("Answer = " + mult);
				break;
			case 4:
				if(num1==0  || num2==0){
					System.out.println("Error:Cannot divide by zero");
				}else{
					int div = num1 / num2;
					System.out.println("Answer = " + div);
					break;
				}
		}
	}
}