import java.util.Scanner;
class Employee{
		
		private int empId;
		private String empName;
		
		void set(int id,String name){
			empId=id;
			empName=name;
		}
		
		void show(){
			System.out.println("Employee Id = "+ empId);
			System.out.println("Employee Name = "+ empName);
		}
}

class User{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter employee name: ");
		String name = sc.nextLine();
		
		Employee e = new Employee();
		
		e.set(id,name);
		e.show();
		
	}
	
}