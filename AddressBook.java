import java.util.ArrayList;
import java.util.Collections;

public class AddressBook {
    private ArrayList<AddressEntry> entries;

    // Constructor
    public AddressBook() {
        this.entries = new ArrayList<>();
    }

    // Add an entry to the address book
    public void addEntry(AddressEntry entry) {
        entries.add(entry);
    }

    // Remove an entry from the address book
    public void removeEntry(AddressEntry entry) {
        entries.remove(entry);
    }

    // Search for entries by last name
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
    public ArrayList<AddressEntry> listEntriesAlphabetically() {
        ArrayList<AddressEntry> sortedEntries = new ArrayList<>(entries);
        Collections.sort(sortedEntries, (a, b) -> a.getLastName().compareTo(b.getLastName()));
        return sortedEntries;
    }
}
