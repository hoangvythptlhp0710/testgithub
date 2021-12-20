import java.util.Scanner;
import java.util.Stack;

public class nenchuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            String s = sc.next() + "s", result = "";
            n = s.length();
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (stack.isEmpty() || stack.peek().equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
                    stack.push(String.valueOf(s.charAt(i)));
                } else {
                    int count = 0;
                    result += stack.peek();
                    while (!stack.isEmpty()) {
                        count++;
                        stack.pop();
                    }
                    result += count;
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }
            if (result.length() >= s.length()) {
                System.out.println(s);
            } else if (result.length() < s.length()) {
                System.out.println(result);
            }
        }
    }
}
