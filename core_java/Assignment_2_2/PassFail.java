import java.util.*;
class PassFail{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Marks of three subject :");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		
		int count = 0;

		if(sub1 <= 40 ){
			count++;
		}
		if(sub2 <=40){
			count++;
		}
		if(sub3 <=40){
			count++;
		}else{
			System.out.println("Pass");
		}

		if(count >=1){
			System.out.println("Fail in "+ count +" subjects");
		}
	}
}