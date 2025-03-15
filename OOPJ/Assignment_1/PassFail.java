import java.util.Scanner;

class PassFail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        
        String result = (percentage >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        
    }
}