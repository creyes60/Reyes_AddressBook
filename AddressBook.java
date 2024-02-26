import java.util.ArrayList;
import java.util.Collections;
/**
 * The AddressBook class represents a collection of AddressEntry objects.
 * It provides methods to add, remove, search, and list entries within the address book.
 *
 * @author Christian Reyes
 * @version 1.0
 * @since 2024-02-10
 */

public class AddressBook {
    private ArrayList<AddressEntry> entries;

    // Constructor
    /**
     * Constructs an AddressBook object with an empty list of entries.
     */
    public AddressBook() {
        this.entries = new ArrayList<>();
    }

    // Add an entry to the address book
    /**
     * Adds an AddressEntry to the address book.
     *
     * @param entry The AddressEntry to add.
     */
    public void addEntry(AddressEntry entry) {
        entries.add(entry);
    }

    // Remove an entry from the address book
    /**
     * Removes an AddressEntry from the address book.
     *
     * @param entry The AddressEntry to remove.
     */
    public void removeEntry(AddressEntry entry) {
        entries.remove(entry);
    }

    // Search for entries by last name
    /**
     * Searches for AddressEntries by last name.
     *
     * @param lastName The last name to search for.
     * @return An ArrayList of AddressEntries with matching last names.
     */
    public ArrayList<AddressEntry> searchByLastName(String lastName) {
        ArrayList<AddressEntry> resultSet = new ArrayList<>();
        for (AddressEntry entry : entries) {
            if (entry.getLastName().startsWith(lastName)) {
                resultSet.add(entry);
            }
        }
        return resultSet;
    }

    // List entries alphabetically
    /**
     * Lists entries in the address book alphabetically by last name.
     *
     * @return An ArrayList of AddressEntries sorted alphabetically.
     */
    public ArrayList<AddressEntry> listEntriesAlphabetically() {
        ArrayList<AddressEntry> sortedEntries = new ArrayList<>(entries);
        Collections.sort(sortedEntries, (a, b) -> a.getLastName().compareTo(b.getLastName()));
        return sortedEntries;
    }
}
