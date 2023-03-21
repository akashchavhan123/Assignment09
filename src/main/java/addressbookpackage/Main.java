package addressbookpackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Akash","Chavhan","Amt","Amravati","Amravati",444602,878856042,
                "abc@gmail.com");
        Contact c2 = new Contact("Virat","Kohli","Delhi","Delhi","Delhi",444602,878856042,
                "virat@gmail.com");

        ArrayList<Contact> AddressBook = new ArrayList<Contact>();
        AddressBook.add(c1);
        AddressBook.add(c2);
        System.out.println(AddressBook);
    }
}
