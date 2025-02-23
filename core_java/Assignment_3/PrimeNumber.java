class PrimeNumber{
	public static void main(String[]args){
		
		int count=0;
		int i=1;
		while(i>=5){
			int n=1;
			for(int j=1;j<=n;j++){
				if(n%j==0){
					count++;
				}
				n++;
			}
			if(count == 2){
				System.out.println(n);
				i++;
			}
		}
	}
}