class AbsoluteValue{
	public static void main(String[] args){
		abs(4);
		abs(-5);
	}
	
	public static void abs(int num){ 
		int mask = num >> 5; 
		int abs = (num + mask) ^ mask;
		System.out.println(abs);
	} 
}	


