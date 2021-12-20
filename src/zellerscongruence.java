import java.util.Scanner;



public class zellerscongruence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int yotc = sc.nextInt();
        int year = (yotc % 100);
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter the day of the month (1 - 31): ");
        int dayofthemonth = sc.nextInt();
        if (dayofthemonth < 1 && dayofthemonth > 31){
            System.out.println("Sorry, it is not suitable date.");
        }
        else{
        int century = year / 100;

        double dotw = (dayofthemonth + ((26 * (month + 1)) / 10) + year + (year / 4) + (century / 4) + 5 * century) % 7;

        int dayoftheweek = (int) Math.ceil(dotw);
        // int dayoftheweek = (int) dotw;

        String a = "Day of the week is ";

        if (dayoftheweek == 0) {
            System.out.println(a + "Saturday.");
        } else if (dayoftheweek == 1) {
            System.out.println(a + "Sunday.");
        } else if (dayoftheweek == 2) {
            System.out.println(a + "Monday.");
        } else if (dayoftheweek == 3) {
            System.out.println(a + "Tuesday.");
        } else if (dayoftheweek == 4) {
            System.out.println(a + "Wednesday.");
        } else if (dayoftheweek == 5) {
            System.out.println(a + "Thursday.");
        } else if (dayoftheweek == 6) {
            System.out.println(a + "Friday.");
        }
    }

}
}
