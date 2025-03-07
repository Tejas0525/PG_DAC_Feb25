/*5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.*/
class FloatingPoints{
    public static void main(String[] args) {
        int binaryLiteral = 0b1010;  // binary literal
        int octalLiteral = 012;      // octal literal
        int hexLiteral = 0x1A;       // hexadecimal literal
        float floatLiteral = 3.14f;  // floating-point literal
        double doubleLiteral = 3.14159;  // double floating-point literal
        
        System.out.println("Binary Literal: " + binaryLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Hexadecimal Literal: " + hexLiteral);
        System.out.println("Floating-point Literal (float): " + floatLiteral);
        System.out.println("Floating-point Literal (double): " + doubleLiteral);
    }
}
