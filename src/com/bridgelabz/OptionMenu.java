
package com.bridgelabz;

import java.util.*;

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
            System.out.println("3 - EDIT CONTACT");
            System.out.println("4 - DELETE CONTACT");
            System.out.println("5 - QUIT CONTACT MENU");
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
                    editPerson();
                    break;
                case 4:
                    removePerson();
                    break;
                case 5:
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
            System.out.println("SELECT OPTION \n 1. CREATE ADDRESS BOOK /2. DISPLAY ADDRESS BOOK / 0. EXIT ");
            System.out.print("Enter Option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ENTER NAME OF ADDRESS BOOK: ");
                    String addBookName = scanner.next();
                    if(bookList.containsKey(addBookName))
                        System.out.println("ADDRESSBOOK NAME ALREADY EXISTS");
                    else
                        bookList.put(addBookName, option.operation());
                    break;
                case 2:
                    if (!bookList.isEmpty()) {
                        Iterator it = bookList.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry obj = (Map.Entry) it.next();
                            System.out.println(obj.getKey());
                        }
                    }else
                        System.out.println("::::::::::::::EMPTY ADDRESSBOOK DATABASE:::::::::::::::");
                    break;
                case 0:
                    System.exit(0);

                    break;
                default:
                    throw new IllegalStateException("INVALID CHOICE: " + choice);
            }
        }
    }
}