import java.util.Scanner;
public class Testthuatoan {
    public static int dequy(int n){
        if (n < 10 || n > 20){
            System.out.println("But you must enter an integer between 10 and 20: ");
            dequy(n);
        }
        else{
            System.out.println("Thank you, " + n + " it is!");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 10 and 20");
        int n = sc.nextInt();
        dequy(n);

    }
}
