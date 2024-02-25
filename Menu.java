import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    // Constructor
    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // Display the menu and get user choice
    public char displayMenu() {
        System.out.println("a) Loading of entries from a file.");
        System.out.println("b) Addition - New Address Entry");
        System.out.println("c) Removal - Remove an Entry");
        System.out.println("d) Find - Find Entry using Last Name");
        System.out.println("e) Listing - listing of the addresses in alphabetical order by the person's last name");
        System.out.println("f) Quit");

        System.out.print("Enter your choice: ");
        return scanner.nextLine().toLowerCase().charAt(0);
    }
}
