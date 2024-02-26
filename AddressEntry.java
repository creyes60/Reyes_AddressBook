public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String phone;

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

    // Getters and Setters for each attribute
    public String getLastName() {
        return lastName;
    }

    

    @Override
    public String toString() {
        return String.format("%s %s\n%s\n%s, %s %s\nEmail: %s\nPhone: %s", firstName, lastName, street, city, state, zipCode, email, phone);
    }
}
