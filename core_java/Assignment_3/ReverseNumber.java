class ReverseNumber{
	public static void main(String[]args){
		int n = 1234;
		int temp=n;
		int rem = 0;
		int rev=0;
		
		while(n>0){
			rem=n%10;
			rev=(rev*10)+rem;
			n= n/10;
		}
		System.out.println("The reverse of "+ temp + " is " + rev);
	}
}