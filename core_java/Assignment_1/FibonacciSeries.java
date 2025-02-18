class FibonacciSeries{
	public static void main(String[]args){
		
		int a=0;
		int b=1;
		int c=a;
		
		for(int i=0;i<10;i++){
			System.out.println(c + " ");	
			a=b;
			b=c;
			c=a+b;
		}
		
	}
}