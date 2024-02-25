import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookApplication {
    private AddressBook addressBook;
    private Menu menu;

    // Constructor
    public AddressBookApplication() {
        this.addressBook = new AddressBook();
        this.menu = new Menu();
    }

    // Run the address book application
    public void run() {
        while (true) {
            char choice = menu.displayMenu();
            switch (choice) {
                case 'a':
                    loadEntriesFromFile();
                    break;
                case 'b':
                    addEntry();
                    break;
                case 'c':
                    removeEntry();
                    break;
                case 'd':
                    findEntry();
                    break;
                case 'e':
                    listEntries();
                    break;
                case 'f':
                    return; // Quit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Load entries from a file (not implemented)
    private void loadEntriesFromFile() {
        System.out.println("Loading entries from file... (Not implemented)");
    }

    // Add a new entry to the address book
    private void addEntry() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter street: ");
        String street = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter state: ");
        String state = scanner.nextLine();

        System.out.print("Enter zip code: ");
        String zipCode = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        AddressEntry newEntry = new AddressEntry(firstName, lastName, street, city, state, zipCode, email, phone);
        addressBook.addEntry(newEntry);

        System.out.println("Entry added successfully!");
    }

    // Remove an entry from the address book
    private void removeEntry() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last name to find entry: ");
        String lastName = scanner.nextLine();

        ArrayList<AddressEntry> searchResults = addressBook.searchByLastName(lastName);

        if (searchResults.isEmpty()) {
            System.out.println("No matching entries found.");
        } else {
            System.out.println("Matching entries:");

            for (int i = 0; i < searchResults.size(); i++) {
                System.out.println((i + 1) + ") " + searchResults.get(i));
            }

            System.out.print("Enter the number of the entry to remove: ");
            int choice = scanner.nextInt();

            if (choice > 0 && choice <= searchResults.size()) {
                addressBook.removeEntry(searchResults.get(choice - 1));
                System.out.println("Entry removed successfully!");
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    // Find entries based on the beginning of the last name
    private void findEntry() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the beginning of the last name: ");
        String partialLastName = scanner.nextLine();

        ArrayList<AddressEntry> searchResults = addressBook.searchByLastName(partialLastName);

        if (searchResults.isEmpty()) {
            System.out.println("No matching entries found.");
        } else {
            System.out.println("Matching entries:");

            for (int i = 0; i < searchResults.size(); i++) {
                System.out.println((i + 1) + ") " + searchResults.get(i));
            }
        }
    }

    // List entries alphabetically
    private void listEntries() {
        ArrayList<AddressEntry> sortedEntries = addressBook.listEntriesAlphabetically();

        System.out.println("Listing entries in alphabetical order by last name:");

        for (int i = 0; i < sortedEntries.size(); i++) {
            System.out.println((i + 1) + ") " + sortedEntries.get(i));
        }
    }
}
