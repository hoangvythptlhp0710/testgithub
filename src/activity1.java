import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = sc.nextInt();
        if (age < 13){
            System.out.println("Not for kids!");
        }
        else if (age > 19){
            System.out.println("You're too old!");
        }
        else {
            System.out.println("Welcome, teenager!");
        }
    }
}
