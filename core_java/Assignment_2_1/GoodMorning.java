import java.util.*;
class GoodMorning{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time: ");
		float time=sc.nextFloat();

		float am = 5.0f;
		float pm = 12.0f;

		if(time >= am && time < pm){
			System.out.println("Good Morning..");
		}else{
			System.out.println("Its not a Morning");
		}
	}
}