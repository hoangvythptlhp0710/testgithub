import java.util.Scanner;

public class tinhGiaiThua {
    public static int dq(int n){
        if (n == 1){
            return 1;
        }
        return n * dq(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(dq(a));
    }
}