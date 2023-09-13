package Examples;

public class E45_Contact {

    private String name;
    private String phoneNumber;

    public E45_Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static E45_Contact createContact(String name, String phoneNumber) {
        return new E45_Contact(name, phoneNumber);
    }
}
