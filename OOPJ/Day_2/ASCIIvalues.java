/*Display character and string literals along with their ASCII values*/
class ASCIIvalues{
    public static void main(String[] args) {
        char character = 'A';
        String stringLiteral = "Hello";
        System.out.println("Character: " + character + ", ASCII Value: " + (int)character);
        System.out.println("String: " + stringLiteral);
		System.out.println("ASCII Value of first char: " + (int)stringLiteral.charAt(0));
    }
}
