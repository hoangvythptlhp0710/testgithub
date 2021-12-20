public class coinConverter {
    public static void main(String[] args) {
        int m = 483724;
        int a = m % 10;
        m = m / 10;
        int c = m % 10;
        m = m / 10;
        int d = m % 100;
        int e = m / 100;
        System.out.println("The amount of money after converting: " + e + " quan, " + d + " dong, " + c + " hao, " + a + " xu.");
    }
}
