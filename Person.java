public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String lastName; // Added lastName field

    // Constructor
    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Default Constructor
    public Person() {
        this.name = "";
        this.phoneNumber = "";
        this.emailAddress = "";
        this.lastName = "";
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
