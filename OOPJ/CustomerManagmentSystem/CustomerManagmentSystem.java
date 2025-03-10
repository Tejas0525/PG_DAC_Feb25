import java.util.Scanner;

class Customer{
	
	int id;
	String name;
	String address;
	long phone;
	
	void add(int id,String name,String address,long phone){
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;	
		System.out.println("Customer added successfully!");
		display();
	}
	
	void update(int id,String name,String address,long phone){
		if(this.id==id){
			this.id=id;
			this.name=name;
			this.address=address;
			this.phone=phone;
		}else{
			System.out.println("Customer data not found.!!");
		}
		
	}
	
	void delete(int id){
		this.id=0;
		this.name=null;
		this.address=null;
		this.phone=0L;
		System.out.println("Customer details deleted successfully!");
		
	}
	
	void display() {
        if (name != null) {
            System.out.println("Customer Details:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Phone: " + phone);
        }else{
			System.out.println("No data Found.!!");
		}
    }

}

class CustomerManagmentSystem{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Customer Managment System.");
		System.out.println("1.Add customer details");
		System.out.println("2.Update customer details");
		System.out.println("3.Delete customer details");
		System.out.println("4.Exit");
		
		System.out.print("Please select option to manage data: ");
		
		int n = sc.nextInt();
		
		Customer customer = new Customer();

		switch(n){
			case 1:
					System.out.println("Enter details to add data:");
					System.out.print("Id :");
					int id = sc.nextInt();
					sc.nextLine();
					
					System.out.print("Name: ");
					String name = sc.nextLine();
					
					System.out.print("Address: ");
					String address = sc.nextLine();
					
					System.out.print("Phone: ");
					long phone = sc.nextLong();
					
					customer.add(id,name,address,phone);
					break;
			case 2:
					System.out.println("Enter details to update data:");
					System.out.print("Id :");
					id = sc.nextInt();
					sc.nextLine();
					
					System.out.print("Name: ");
					name = sc.nextLine();
					
					System.out.print("Address: ");
					address = sc.nextLine();
					
					System.out.print("Phone: ");
					phone = sc.nextLong();
					
					customer.update(id,name,address,phone);
					break;
					
			case 3:
					System.out.print("Enter id to delete data: ");
					id = sc.nextInt();
					sc.nextLine();
					customer.delete(id);
					break;
			
			case 4:
					System.out.println("Exited Sucssefully.");
					System.exit(0);
			
			default:
					System.out.println("Invalid input");
			
		}
	}
}