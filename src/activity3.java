import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = sc.nextInt();
        System.out.print("Please enter b: ");
        int b = sc.nextInt();
        System.out.print("Please enter c: ");
        int c = sc.nextInt();
        if (a == 0 && b == 0 && c == 0){
            System.out.println("There's nothing to be solved");
        }
        else if ((a == 0 && b == 0)){
            System.out.println("The equation has no root.");
        }
        else if (a == 0 && b != 0 && c == 0){
            System.out.println("The equation has only one solution: x = " + 0);
        }
        else if (a == 0 & b != 0 && c != 0){
            int x = (-c/b);
            System.out.println("The equation has only one solution: x = " + x);
        }
        else{
            double delta = ((b*b)-4*a*c);
            if (delta < 0){
                System.out.println("The equation has no real root");
            }
            else if (delta == 0){
                int x0 = (-b/(2*a));
                System.out.println("The equation has only one solution: x = " + x0);
            }
            else{
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("The equation has two roots: " );
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
