package com.company;

public class Contacts {

    private String name;
    private int number;

    public Contacts(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public static Contacts createContact(String name, int number){
        return new Contacts(name, number);
    }

}
