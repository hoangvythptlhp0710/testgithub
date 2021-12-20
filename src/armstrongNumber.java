import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args){
        for (int i = 100; i < 1000; i++){
            int result = 0;
            int temp = i;
            while(temp > 0){
                int j = temp % 10;
                temp = temp / 10;
                result += j * j * j;
            }
            if (result == i){
                System.out.println(i);
            }
        }
    }
}
