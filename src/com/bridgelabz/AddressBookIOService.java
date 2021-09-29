package com.bridgelabz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class AddressBookIOService {
    String filePath = "G:\\Java_Bridgelabz\\Day22_AddressBook\\AddressBook_ALL\\src\\com\\bridgelabz\\ContactsOutput.txt";

    public void writeAddressBook(HashMap<String, ArrayList<Contact>> contactlist) {
        StringBuffer contactBuffer = new StringBuffer();
        contactlist.forEach((addbook, contactInfo) -> {
            String empDataString = addbook.concat(contactInfo.toString().concat("\n"));
            contactBuffer.append(empDataString);
        });
        try {
            Files.write(Paths.get(filePath), contactBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAddressBook() {
        try {
            FileReader fileReader= new FileReader("G:\\Java_Bridgelabz\\Day22_AddressBook\\AddressBook_ALL\\src\\com\\bridgelabz\\ContactsOutput.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str ;
            while((str=bufferedReader.readLine())!=null) {
            System.out.println(str);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}