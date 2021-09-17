package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactMethods {
    List<Contact> contactsList = new ArrayList<Contact>();
    Scanner input = new Scanner(System.in);

    /**
     * ADD NEW CONTACT IN ADDRESSBOOK
     * @return ARRAYLIST OF CONTACTS
     */
    public List<Contact> addNewContact() {
        System.out.println("Enter Firstname:: ");
        String firstname = input.next();
        System.out.println("Enter Lastname");
        String lastname = input.next();
        System.out.println("Enter Address");
        String address = input.next();
        System.out.println("Enter City");
        String city = input.next();
        System.out.println("Enter State");
        String state = input.next();
        System.out.println("Enter ZIP");
        int zip = input.nextInt();
        System.out.println("Enter Phonenumber");
        long phonenumber = input.nextLong();
        System.out.println("Enter Email");
        String email = input.next();

        Contact contact = new Contact();

        contact.setFirstname(firstname);
        contact.setLastname(lastname);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhonenumber(phonenumber);
        contact.setEmail(email);

        contactsList.add(contact);
        return contactsList;
    }

    /**
     * DISPLAY ALL THE CONTACTS IN COLLECTION
     */
    public void displayContacts() {
        contactsList.stream().forEach(contact -> {
            System.out.println(contact);
        });
    }

}
