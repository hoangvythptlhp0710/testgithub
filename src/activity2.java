import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            String a = "The year ";
            String b = " is not a leap year.";
            String c = " is a leap year.";
            if (year % 4 != 0) {
                System.out.println(a + year + b);
            } else {
                if (year % 100 != 0) {
                    System.out.println(a + year + c);
                } else {
                    if (year % 400 == 0) {
                        System.out.println(a + year + c);
                    } else {
                        System.out.println(a + year + b);
                    }
                }
            }
        }
    }
}
