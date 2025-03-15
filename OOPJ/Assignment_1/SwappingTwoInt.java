
class SwappingTwoInt{
	public static void main(String[] args){
		int x = 3, y = 9;
		System.out.println("Before Swapping: x = " + x + ", Y = " + y); 
		x += y;
		y -= x;
		y = -y;
		x -= y;
		System.out.println("After Swapping: x = " + x + ", y = " + y); 
	}
}