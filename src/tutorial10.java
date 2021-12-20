import javax.swing.*;
import java.util.Scanner;

public class tutorial10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("      *******************      ");
        System.out.println("Welcome to a menu-driven program");
        System.out.println("      ******************      ");
        System.out.println("         * ******** *          ");
        while (true){
            System.out.println("[1] BMI calculator");
            System.out.println("[2] Coin converter");
            System.out.println("[3] Leap year checker");
            System.out.println("[4] Quadratic equation solver");
            System.out.println("[5] Password strength meter");
            System.out.println("[6] GCD finder");
            System.out.println("[7] Exit the application");

            System.out.println("Choose an option: ");
            int option = sc.nextInt();
            switch(option){
                //Chương trình 1: Chương trình kiểm tra BMI
                case 1:
                    System.out.println("Enter your weight (kg): ");double weight = sc.nextDouble();
                    System.out.println("Enter your height (m): ");double height = sc.nextDouble();
                    double BMI = (weight/(height * height));
                    if (BMI < 18.5){
                        System.out.println("Your BMI: " + BMI + " => You are underweight");
                    }
                    else if (BMI >= 18.5 && BMI <=24.9){
                        System.out.println("Your BMI: " + BMI + " => You are normal");
                    }
                    else if (BMI > 24.9 && BMI < 30) {
                        System.out.println("Your BMI: " + BMI + " => You are overweight");
                    }
                    else if (BMI > 30){
                        System.out.print("Your BMI: " + BMI + " => You are obese");
                    }
                    break;
                    //Chương trình 2: Chuyển đổi tiền xu
                case 2:
                    System.out.println("Enter the amount of money (xu)");
                    int m = sc.nextInt();
                    int a = m % 10;
                    m = m / 10;
                    int c = m % 10;
                    m = m / 10;
                    int d = m % 100;
                    int e = m / 100;
                    System.out.println("The amount of money after converting: " + e + " quan, " + d + " dong, " + c + " hao, " + a + " xu.");
                    break;
                    // Chương trình thứ 3: Kiểm tra xem năm có phải là năm nhuận hay không
                case 3:
                    System.out.println("Enter the year: ");
                    int year = sc.nextInt();
                    if (year % 4 == 0 || (year % 400 == 0 && year % 100 == 0)) {
                        System.out.println(year + " is a leap year.");
                    }
                    else if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)){
                        System.out.println(year + " is not a leap year.");
                    }
                    break;
                    //Chương trình thứ 4: Tính nghiệm của phương trình bậc hai
                case 4:
                    System.out.println("Enter a, b, c: ");
                    int a1 = sc.nextInt();
                    int a2 = sc.nextInt();
                    int a3 = sc.nextInt();
                    double delta = ((a2*a2) - (4*a1*a3));
                    if (delta < 0){
                        System.out.println("The equation has no solution");
                    }
                    else if (delta == 0){
                        int x = (-a2/(2*a1));
                        System.out.println("The equation has a unique solution: " + x);
                    }
                    else if (delta > 0){
                        double x1 = (-a2 + Math.sqrt(delta))/(2*a1);
                        double x2 = (-a2 - Math.sqrt(delta))/(2*a1);
                        System.out.println("The equation has 2 solutions: ");
                        System.out.println("      x1 = " + x1);
                        System.out.println("      x2 = " + x2);
                    }
                    break;
                    //Chương trình thứ 5: kiểm tra độ mạnh của mật khẩu
                case 5:
                    System.out.println("Enter your password here: ");
                    String pw = sc.next();
                    int score = 0;
                    char[] f = new char[pw.length()];
                    boolean isUpper = false, isLower = false, isDigit = false, isSymbol = false;
                    for (int i = 0; i < pw.length(); i++){
                        if (pw.charAt(i) >= 'a' && pw.charAt(i) <= 'z'){
                            isLower = true;
                            score++;
                            break;
                        }
                    }
                    for (int i = 0; i < pw.length(); i++){
                        if (pw.charAt(i) >= 'A' && pw.charAt(i) <= 'Z'){
                            isUpper = true;
                            score++;
                            break;
                        }
                    }
                    for (int i = 0; i < pw.length(); i++){
                        if (pw.charAt(i) >= '0' && pw.charAt(i) <= '9'){
                            isDigit = true;
                            score++;
                            break;
                        }
                    }
                    for (int i = 0; i < pw.length(); i++){
                        if (isDigit == false && isUpper == false && isLower == false){
                            isSymbol = true;
                            score++;
                            break;
                        }
                    }
                    if (pw.length() >= 8 && pw.length() <= 12) {
                        score += 1;
                    }
                    else if (pw.length() > 12){
                        score += 2;
                    }
                    if (score <= 2){
                        System.out.println("Strength: " + score + " (weak)");
                    }
                    else if (score <= 4){
                        System.out.println("Strength: " + score + " (medium)" );
                    }
                    else if (score <= 6){
                        System.out.println("Strength: " + score + " (strong)");
                    }
                    break;
                    //Chương trình 6: Tính ước chung lớn nhất của 2 số
                case 6:
                    System.out.println("Enter A: ");
                    int A = sc.nextInt();
                    System.out.println("Enter B: ");
                    int B = sc.nextInt();
                    int temp = 1;
                    while (B > 0){
                        A = A % B;
                        temp = A;
                        A = B;
                        B = temp;

                    }
                    int GCD = A;
                    System.out.println("GCD(A,B) = " + GCD);
                    break;
                case 7:
                    System.out.println("Exiting the application...");
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid value!!! Please try again");
            }
        }
    }
}
