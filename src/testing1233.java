import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class testing1233 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to menu-driven program: ");
        while (true){
            System.out.println("1: Add item");
            System.out.println("2: Item list");
            System.out.println("3: Edit an item");
            System.out.println("4: Remove an item");
            System.out.println("5: Exit with the value ");

            System.out.println("Enter the value: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Adding a new item...");
                    System.out.println("Added a new item");
                    break;
                case 2:
                    System.out.println("Listing all item...");
                    System.out.println("Listed all item");
                    break;
                case 3:
                    System.out.println("Editing a item...");
                    System.out.println("Item is edited");
                    break;
                case 4:
                    System.out.println("Removing a item...");
                    System.out.println("Removed a item");
                    break;
                case 5:
                    System.out.println("Exiting the application...");
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid value!!! Please retry");
            }
        }
    }
}




