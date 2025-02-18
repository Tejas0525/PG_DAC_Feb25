import java.util.*;
class AreaOfCircle{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		int r = sc.nextInt();

		double area=3.14159 * r*r;
		System.out.println("Area of circle: "+area);
	}

}
