

import java.util.Scanner;

public class act4 {
    public static void countLastDigits(int[] a) {
        int[] myarr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int i = 0; i < a.length; i++) {
                String s = String.valueOf(a[i]);
                char[] c = s.toCharArray();
                    for (int j = 0; j < myarr.length; j++) {
                        if (c[s.length() - 1] == j) {
                            myarr[j]++;
                }
            }
        }
        System.out.println(myarr);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20};
        countLastDigits(a);
    }
}
