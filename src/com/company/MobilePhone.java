package com.company;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contacts> contact = new ArrayList<>();

    String MobilePhone(String number){
        this.contact = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contacts){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }
}
