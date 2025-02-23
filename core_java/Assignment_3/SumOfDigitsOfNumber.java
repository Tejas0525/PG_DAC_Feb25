import java.util.Scanner;
class SumOfDigitsOfNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		long num = sc.nextLong();

		int sum =0;
		long rem=0;

		while(num>0){
			rem=num%10;
			sum +=rem;
			num=num/10;
		}
		System.out.print("Sum = " + sum);
	}
}