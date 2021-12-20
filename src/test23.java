import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < (t+1); i++){
            int n = sc.nextInt();
            String input = sc.nextLine();
            String output = input.trim().replaceAll("(\\s)+", "%");
            System.out.println(output);
        }
    }
}
