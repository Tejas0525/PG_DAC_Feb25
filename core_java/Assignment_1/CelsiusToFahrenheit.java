import java.util.*;
class CelsiusToFahrenheit{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter degree celsius: ");
		float celsius = sc.nextInt();
		float fahrenheit = (celsius*9/5)+32;
		System.out.println(celsius + "C is equal to " + fahrenheit + "F");		
	
	}
}
	