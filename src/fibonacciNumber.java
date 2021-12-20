import java.util.Scanner;

public class fibonacciNumber {

    public static int fbnumber(int n){
        if (n < 0){
            return -1;
        }
        else if (n == 0 || n == 1){
            return n;
        }
        else {
            return fbnumber(n-1) + fbnumber(n-2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++){
            b = fbnumber(i);
        }
        System.out.println(b);
    }
}
