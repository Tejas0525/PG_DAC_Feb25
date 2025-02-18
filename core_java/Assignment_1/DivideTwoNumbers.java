import java.util.*;
class DivideTwoNumbers{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		float ans = 0;
		if(num1 ==0 || num2==0){
			System.out.println("Cannot divide by 0");
			
		}else{
			ans=num1/num2;
			System.out.println(ans);
		}
	}
}