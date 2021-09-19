package com.bridgelabz;

import java.util.*;

public class ContactMethods {
    //ABILITY TO ADD MULTIPLE PERSONS IN ADDRESSBOOK USING COLLECTION ARRAYLIST
    List<Contact> contactsList = new ArrayList<Contact>();
    Scanner input = new Scanner(System.in);

    /**
     * ADD NEW CONTACT IN ADDRESSBOOK
     *
     * @return ARRAYLIST OF CONTACTS
     */
    public List<Contact> addNewContact() {
        Contact contact = new Contact();
        try {
            System.out.println("Enter Firstname:: ");
            String firstname = input.next();
            if (isthereaDuplicateName(firstname) == true) {
                System.out.println("NAME ALREADY EXISTS");
                return null;
            }
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

            contact.setFirstname(firstname);
            contact.setLastname(lastname);
            contact.setAddress(address);
            contact.setCity(city);
            contact.setState(state);
            contact.setZip(zip);
            contact.setPhonenumber(phonenumber);
            contact.setEmail(email);

            contactsList.add(contact);

        } catch (Exception e) {
            System.out.println(":::::::::::::::::::::INVALID ENTRY::::::::::::::::::::::");
        }
        return contactsList;
    }

    /**
     * DISPLAY ALL THE CONTACTS IN COLLECTION
     */
    public void displayContacts() {
        if (contactsList.isEmpty()) {
            System.out.println("::::::::::::::::::CONTACT LIST IS EMPTY:::::::::::::::::: ");
        } else
            contactsList.stream().forEach(contact -> {
                System.out.println(contact);
            });
    }

    /**
     * EDIT CONTACT BASED ON FIRST NAME
     */
    public void editPerson() {

        System.out.println("ENTER FIRST NAME OF CONTACT TO BE EDITED:");
        String editName = input.next();

        boolean found = false;
        for (Contact contact : contactsList) {
            if (contact.getFirstname().equals(editName)) {
                found = true;
                System.out.println(contact);
                System.out.println("What do you want to edit \n" +
                        "1. First Name / 2. Last Name / 3. Address / 4. City / " +
                        "5. State / 6. Zip code / 7. Phone Number / 8. Email");
                System.out.println("ENTER CHOICE: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter new First Name");
                        String newFirstName = input.next();
                        contact.setFirstname(newFirstName);
                        break;

                    case 2:
                        System.out.println("Enter new Last Name");
                        String newLastName = input.next();
                        contact.setLastname(newLastName);
                        break;

                    case 3:
                        System.out.println("Enter new Address");
                        String newAddress = input.next();
                        contact.setAddress(newAddress);
                        break;

                    case 4:
                        System.out.println("Enter new City");
                        String newCity = input.next();
                        contact.setCity(newCity);
                        break;

                    case 5:
                        System.out.println("Enter new State");
                        String newState = input.next();
                        contact.setState(newState);
                        break;

                    case 6:
                        System.out.println("Enter new Zip code");
                        int newZip = input.nextInt();
                        contact.setZip(newZip);
                        break;

                    case 7:
                        System.out.println("Enter new Phone Number");
                        long newPhoneNo = input.nextLong();
                        contact.setPhonenumber(newPhoneNo);
                        break;

                    case 8:
                        System.out.println("Enter new Email");
                        String newEmail = input.next();
                        contact.setEmail(newEmail);
                        break;
                }
            }
        }
        if (found)
            System.out.println("SUCCESSFUL");
        else
            System.out.println("NAME NOT FOUND");
    }

    /**
     * DELETE CONTACT BASED ON FIRSTNAME
     */
    public void removePerson() {
        System.out.println("ENTER NAME TO BE DELETED");
        String removeName = input.next();

        boolean found = false;
        for (int i = 0; i < contactsList.size(); i++) {

            if (contactsList.get(i).getFirstname().equals(removeName)) {
                found = true;
                contactsList.remove(i);
            }
        }
        if (found)
            System.out.println("SUCCESSFUL");
        else
            System.out.println("NAME NOT FOUND");
    }

    /**
     * TO CHECK IF NAME IS UNIQUE
     *
     * @param firstname
     * @return IF DUPLICATE RETURN TRUE
     */
    public boolean isthereaDuplicateName(String firstname) {
        for (Contact contact : contactsList) {
            if (contact.getFirstname().equals(firstname)) {
                return true;
            }
        }
        return false;
    }
    public void contactsListSize(){
        int size = contactsList.size();
       System.out.println("SIZE OF CONTACT LIST: "+size);
    }
}
