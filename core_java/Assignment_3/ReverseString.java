class ReverseString{
	public static void main(String[]args){
		String str = "Pritesh";
		String str1 = "";

		for(int i=str.length()-1;i>=0;i--){
			char ch = str.charAt(i);
			str1 += ch;
		}
		System.out.println("Original string = "+str);
		System.out.println("Reverse string = "+str1);
	}
}