import java.util.Scanner;
/**
 * The Menu class represents a simple menu for an address book application.
 * It provides options for loading entries from a file, adding, removing, finding, and listing entries, as well as quitting the program.
 *
 * @author Christian Reyes
 * @version 1.0
 * @since 2024-02-10
 */
public class Menu {
    private Scanner scanner;

    // Constructor
    /**
     * Constructs a Menu object with a new Scanner.
     */
    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // Display the menu and get user choice
    /**
     * Displays the menu options and prompts the user to enter their choice.
     *
     * @return The user's choice as a character.
     */
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
