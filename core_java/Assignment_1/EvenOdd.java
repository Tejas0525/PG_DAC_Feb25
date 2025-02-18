import java.util.*;
class EvenOdd{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		if(num%2==0){
			System.out.println("Number "+ num +"is even.");
		}else{
			System.out.println("Number "+ num +" "+"is odd.");
		}
	}
}