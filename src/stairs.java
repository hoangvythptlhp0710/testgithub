import java.util.Scanner;

public class stairs {
    public static int banhmi (int a, int b) {
        int[] arr = new int[a];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (Math.abs(arr[i] - arr[j]) == b)  ++count;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(banhmi(n,k));
        }
    }
}
