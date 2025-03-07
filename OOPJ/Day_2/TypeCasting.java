/*3. Write a program to convert a double value to int using typecasting and explain the data loss.*/
class TypeCasting{
	public static void main(String[]args){
		
			double d = 123.45;
			int n = (int)d;
			
			System.out.println("Double = "+ d);
			System.out.println("After type casting int to double:");
			System.out.println("Int = "+ n);
			
			System.out.println("loss of 0.45 decimals");
		
	}
}