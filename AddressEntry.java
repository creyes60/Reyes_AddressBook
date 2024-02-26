/**
 * The AddressEntry class represents an entry for a person's address information.
 * It includes details such as first name, last name, street, city, state, zip code, email, and phone number.
 * This class provides a constructor to initialize the address entry and getter/setter methods for each attribute.
 *
 * @author Christian Reyes
 * @version 1.0
 * @since 2024-02-10
 */
public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String phone;


    /**
     * Constructs an AddressEntry object with the specified details.
     *
     * @param firstName The first name of the person.
     * @param lastName  The last name of the person.
     * @param street    The street address.
     * @param city      The city.
     * @param state     The state or region.
     * @param zipCode   The zip code.
     * @param email     The email address.
     * @param phone     The phone number.
     */
    // Constructor
    public AddressEntry(String firstName, String lastName, String street, String city, String state, String zipCode, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        this.phone = phone;
    }
    /**
     * Gets the last name of the person.
     *
     * @return The last name.
     */
    // Getters and Setters for each attribute
    public String getLastName() {
        return lastName;
    }

    // getters and setters for other attributes
    /**
     * Returns a string representation of the AddressEntry.
     * The string includes the full name, address, email, and phone number.
     *
     * @return A formatted string representing the AddressEntry.
     */
    @Override
    public String toString() {
        return String.format("%s %s\n%s\n%s, %s %s\nEmail: %s\nPhone: %s", firstName, lastName, street, city, state, zipCode, email, phone);
    }
}
