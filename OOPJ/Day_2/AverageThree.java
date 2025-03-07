/*4. Write a program to calculate the average of three int numbers using typecasting to display the result in double.*/
class AverageThree{
	public static void main(String[]args){

			int n1 = 10;
			int n2 = 20;
			int n3 = 30;
			
			double d = (double)n1 + n2 + n3/3;
			
			System.out.println("3 number are "+n1+ ", " +n2+ ", " +n3+ ".");
			System.out.println("Average of 3 numbers: "+ d);
		
	}
}	