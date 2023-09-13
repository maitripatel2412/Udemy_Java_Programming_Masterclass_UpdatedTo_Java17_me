package Examples;

import java.util.ArrayList;

public class E45_MobilePhone {

    public static void main(String[] args) {

        E45_Contact contact = new E45_Contact("maitri","8347663952");
        contact.getPhoneNumber();
        contact.getName();
        System.out.println(contact.getPhoneNumber()+contact.getName());
        addNewContact(contact);
        printContacts();
    }

    private String myNumber;

    private static ArrayList<E45_Contact> myContacts;

    public E45_MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public static boolean addNewContact(E45_Contact contact) {

        if (findContact(contact) != -1) {
            return false;
        } else {
            return myContacts.add(contact);
        }
    }

    public static boolean updateContact(E45_Contact oldContact, E45_Contact newContact) {
        if (findContact(oldContact) != -1) {
            return myContacts.remove(oldContact) && myContacts.add(newContact);
        } else {
            return false;
        }
    }

    public static boolean removeContact(E45_Contact contact) {
        return findContact(contact) == -1 ? false : myContacts.remove(contact);
    }

    private static int findContact(E45_Contact queryContact) {
        return findContact(queryContact.getName());
    }

    private static int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            E45_Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public static E45_Contact queryContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            E45_Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public static void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            E45_Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
