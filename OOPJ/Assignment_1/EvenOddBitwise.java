import java.util.Scanner;

class EvenOddBitwise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       
        System.out.println("The number is: " + ((num & 1) == 0 ? "Even" : "Odd"));

        sc.close();
    }
}