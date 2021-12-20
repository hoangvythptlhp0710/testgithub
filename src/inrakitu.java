import java.util.Scanner;

public class inrakitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t + 1; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                if ( j % 2 == 0){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print(" ");
            for (int k = 0; k < s.length(); k++) {
                if (k % 2 != 0){
                    System.out.print(s.charAt(k));
                }
            }
            System.out.println();
        }
    }
}
