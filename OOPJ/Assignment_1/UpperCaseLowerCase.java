import java.util.Scanner;

class UpperCaseLowerCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";

        
        System.out.println("The character is: " + result);

       
    }
}