import java.util.Scanner;

public class Solution {
    static int test(int n) {
        int m = 2;
        if (n == 0){
            return 0;
        }
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = 0;
            for (int j = 1; j <= m && j <= i; j++)
                arr[i] += arr[i - j];
        }
        return arr[n - 1];
    }

    static int dembuoc(int s) {
        int m = 2;
        return test(s + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int s = sc.nextInt();
            System.out.println(dembuoc(s));
        }
    }
}