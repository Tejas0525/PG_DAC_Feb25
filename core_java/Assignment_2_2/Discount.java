import java.util.Scanner;
class Discount{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Is coustomer have Membership card ? (Y/N) : ");
		char yn = sc.next().charAt(0);
		boolean membershipCard =false;
		if(yn == 'y' || yn == 'Y'){
			membershipCard = true;
		}else{
			membershipCard = false;
		}
		System.out.print("Enter total bill: ");
		double totalAmount = sc.nextDouble();
		double discount = 0;

		if(totalAmount >= 1000){
			if(membershipCard){
				discount = totalAmount-(totalAmount*0.25);
				System.out.println("Total Bill: " + totalAmount);
				System.out.println("Discount Bill: " + discount);
			}else{
				discount = totalAmount-(totalAmount*0.2);
				System.out.println("Total Bill: " + totalAmount);
				System.out.println("Discount Bill: " + discount);
			}
			
		}else if(totalAmount >= 50 && totalAmount <= 999){
			if(membershipCard){
				discount = totalAmount-(totalAmount*0.15);
				System.out.println("Total Bill: " + totalAmount);
				System.out.println("Discount Bill: " + discount);
			}else{
				discount = totalAmount-(totalAmount*0.1);
				System.out.println("Total Bill: " + totalAmount);
				System.out.println("Discount Bill: " + discount);
			}
		
		}else if(totalAmount <= 500){
			if(membershipCard){
				discount = totalAmount-(totalAmount*0.1);
				System.out.println("Total Bill: " + totalAmount);
				System.out.println("Discount Bill: " + discount);
			}else{
				discount = totalAmount-(totalAmount*0.05);
				System.out.println("Total Bill: " + totalAmount);
				System.out.println("Discount Bill: " + discount);
			}
		
		}else{
			System.out.println("Not applicable for discount");
		}
	}
}
