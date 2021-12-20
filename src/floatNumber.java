public class floatNumber {
    public static void main(String[] args) {
        float a = 1000000.1f;
        if (a == 0.0){
            System.out.println("The number is zero.");
        }
        else if (a > 0 && a < 1f){
            System.out.println("A small positive number.");
        }
        else if (a >= 1f && a <= 1000000f){
            System.out.println("A positive number.");
        }
        else if (a > 1000000f){
            System.out.println("A large positive number.");
        }
        else if (a < 0 && a > -1f){
            System.out.println("A small negative number.");
        }
        else if (a <= -1f && a > 1000000){
            System.out.println("A negative number.");
        }
        else if (a < -1000000){
            System.out.println("A large negative number.");
        }
    }
}
