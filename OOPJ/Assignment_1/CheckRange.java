class CheckRange{
    public static void main(String[] args) {
        int x = 71, y = 32;
        check(x);
        check(y);
    }
    public static void check(int a) {
        System.out.println((a >= 20 && a <= 50) ? a + " lies in the range." : a + " doesn't lie within the range");
    }
}