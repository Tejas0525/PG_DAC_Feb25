import java.util.*;
class PowerOfNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base number:");
		int baseNumber = sc.nextInt();
		System.out.print("Enter exponent number:");
		int exponentNumber = sc.nextInt();
		int ans=1;

		for(int i=exponentNumber;i>0;i--){
			ans=ans*baseNumber;
		}		
		System.out.println(ans);
	}
}