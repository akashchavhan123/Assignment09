package addressbookpackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Akash","Chavhan","Amt","Amravati","MH",444602,878856042,
                "abc@gmail.com");
        Contact c2 = new Contact("Virat","Kohli","Delhi","Delhi","Delhi",444602,878856042,
                "virat@gmail.com");

        ArrayList<Contact> AddressBook = new ArrayList<Contact>();
        AddressBook.add(c1);
        AddressBook.add(c2);
        System.out.println("Before Update"+AddressBook);
        AddressBook.set(0,new Contact("Rohit","Sharma","Mumbai","bandra","MH",444502,546879,"abc@gamil.com"));
        System.out.println("After Update"+AddressBook);
        AddressBook.remove(1);
        System.out.println("After Delete"+AddressBook);

    }
}
