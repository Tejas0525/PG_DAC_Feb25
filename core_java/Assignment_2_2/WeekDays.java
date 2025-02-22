import java.util.*;
class WeekDays{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int day = sc.nextInt();

		switch(day){
			case 1:
				System.out.println("Monday \nWeekday");
				break;
			case 2:
				System.out.println("Tuesday \nWeekday");
				break;
			case 3:
				System.out.println("Wednesday \nWeekday");
				break;
			case 4:
				System.out.println("Thursday \nWeekday");
				break;
			case 5:
				System.out.println("Friday \nWeekday");
				break;
			case 6:
				System.out.println("Saturday \nWeekend");
				break;
			case 7:
				System.out.println("Sunday \nWeekend");
				break;
		}
	}
}