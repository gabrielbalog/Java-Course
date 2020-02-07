package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();


    public void addContactItem(String name, String number) {
        if (findItem(name) < 0) {
            contacts.add(new Contact(name, number));
            System.out.println("Contact Added!");
        } else {
            System.out.println("Contact already defined.");
        }
    }

    public void printContactList() {
        System.out.println("You have " + contacts.size() + " contacts in your contact list");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i).getName() + " - (" + contacts.get(i).getPhoneNumber() + ")");
        }
    }

    public void modifyContactItem(String currentItem, String name, String number) {
        int position = findItem(currentItem);
        if (position >= 0) {
            if (findItem(currentItem) < 0) {
                modifyContactItem(position, new Contact(name, number));
            } else {
                System.out.println("Contact with this name already exists.");
            }
        } else {
            System.out.println("Contact do not exists!");
        }
    }

    private void modifyContactItem(int position, Contact newItem) {
        contacts.set(position, newItem);
        System.out.println("Contact item " + (position + 1) + " has been modified");
    }

    public void removeContactItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeContactItem(position);
            System.out.println("Contact Removed!");
        } else {
            System.out.println("Contact do not exists!");
        }
    }

    private void removeContactItem(int position) {
        contacts.remove(position);
    }

    private int findItem(String searchItem) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(searchItem)) {
                return i;
            }
        }
        return -1;
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }
}
