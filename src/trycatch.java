import java.util.Scanner;

import org.codehaus.groovy.runtime.powerassert.SourceText;

public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isTest = true;
        while (!isTest){
            try{
                System.out.println("Enter an integer: ");
                
                System.out.println("Right, it's an integer");
                isTest = true;
            }
            catch (Exception e ){
                System.out.println(e.getMessage());
            }
        }
    }
}
