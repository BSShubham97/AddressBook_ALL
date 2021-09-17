
package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class OptionMenu extends ContactMethods {
    /**
     * OPERATION MENU OF CONTACT BOOK
     *
     * @return
     */
    public ArrayList<Contact> operation() {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        do {
            System.out.println("Choose a option: ");
            System.out.println("1 - CREATE NEW CONTACT");
            System.out.println("2 - DISPLAY ALL CONTACTS");
            System.out.println("3 - QUIT CONTACT MENU");
            System.out.print("Enter Option: ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    System.out.println("PROGRAM EXITED !");
                    quit = true;
                    break;
            }
        }
        while (!quit);
        return (ArrayList<Contact>) contactsList;
    }
}

/**
 * OPERATION MENU OF ADDRESSBOOK
 */
class MultipleBooks {

    public void createBook() {
        HashMap<String, ArrayList<Contact>> bookList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            OptionMenu option = new OptionMenu();
            System.out.println("SELECT OPTION \n 1. CREATE ADDRESS BOOK / 0. EXIT ");
            System.out.print("Enter Option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    option.operation();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}