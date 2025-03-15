import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        
        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = (num2 != 0) ? (num1 / num2) : Double.NaN; break;
            default:
                validOperation = false;
                System.out.println("Invalid operator");
        }

       
        if (validOperation) {
            System.out.println("Result: " + result);
        }

       
    }
}