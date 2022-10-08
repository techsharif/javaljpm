package section08.challenges.c44;

import java.util.ArrayList;

public class MobilePhone {
    // write code here

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        int pos = findContact(contact);
        if (pos == -1) {
            this.myContacts.add(contact);
            return true;
        }

        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int pos = findContact(oldContact);
        if (pos == -1) return false;

        this.myContacts.set(pos, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int pos = findContact(contact);
        if (pos == -1) return false;

        this.myContacts.remove(pos);
        return true;
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); ++i) {
            if (myContacts.get(i).getPhoneNumber().equals(contact.getPhoneNumber()) &&
                    myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }

        return -1;
    }

    private int findContact(String phoneNumber) {
        for (int i = 0; i < myContacts.size(); ++i) {
            if (myContacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact myContact : myContacts) {
            if (myContact.getName().equals(name)) {
                return myContact;
            }
        }

        return null;
    }

    public void printContacts() {
        int i = 1;
        System.out.println("Contact List:");
        for (Contact myContact : myContacts) {
            System.out.println(i + ". " + myContact.getName() + " -> " + myContact.getPhoneNumber());
            ++i;
        }

    }


}