package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To the list of contacts");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item in the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContactItem(name, phoneNumber);
    }

    public static void modifyItem() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();

        if (mobilePhone.onFile(name)) {
            System.out.println("Found " + name + " in your contacts list");

            System.out.print("Enter replacement name: ");
            String newName = scanner.nextLine();

            System.out.print("Enter replacement phone number: ");
            String newNumber = scanner.nextLine();
            mobilePhone.modifyContactItem(name, newName, newNumber);
        } else {
            System.out.println(name + " is not in the contacts list");
        }

    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        mobilePhone.removeContactItem(name);
    }

    public static void searchForItem() {
        System.out.print("Item for search for: ");
        String searchItem = scanner.nextLine();
        if (mobilePhone.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in your contacts list");
        } else {
            System.out.println(searchItem + " is not in the contacts list");
        }
    }

}
