package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(Branch branch) {
        if (findBranch(branch.getName()) < 0) {
            branches.add(branch);
            System.out.println("Bank: Branch added");
            return true;
        }
        System.out.println("Bank: Branch already in the database");
        return false;
    }

    public boolean addCustomerToBranch(Customer customer, Branch branch) {
        int position = findBranch(branch.getName());
        if (position >= 0) {
            boolean isAdded = branches.get(position).addCustomer(customer);
            if (isAdded) {
                System.out.println("Bank: Customer: " + customer.getName() + ". Added to branch: " + branch.getName());
                return true;
            }
            System.out.println("Bank: Error, Customer not added");
            return false;
        }
        System.out.println("Bank: Branch not Found");
        return false;
    }

    public boolean addTransactionToCustomer(Customer customer, Branch branch, Double value) {
        int position = findBranch(branch.getName());
        if (position >= 0) {
            boolean isAdded = branches.get(position).addTransactionToCustomer(customer, value);
            if (isAdded) {
                System.out.println("Bank: Transaction on the value of: " + value + " Added to Customer: " + customer.getName() + ". On branch: " + branch.getName());
                return true;
            }
            System.out.println("Bank: Error, Customer not Found");
            return false;
        }
        System.out.println("Bank: Branch not Found");
        return false;
    }

    public void printBranches() {
        for (int i = 0; i < branches.size(); i++) {
            System.out.println("Bank: Branch #" + (i + 1) + ": " + branches.get(i).getName());
        }
    }

    public void printCustomers(Branch branch) {
        int position = findBranch(branch.getName());
        if (position >= 0) {
            System.out.println("Bank: Branch #" + (position + 1) + ": " + branches.get(position).getName());
            branches.get(position).printCostumers();
        } else {
            System.out.println("Branch not found!");
        }
    }

    public void printCustomerTransactions(Branch branch, Customer customer) {
        int position = findBranch(branch.getName());
        if (position >= 0) {
            branches.get(position).printTransactionsForCustomer(customer);
        } else {
            System.out.println("Branch not found!");
        }
    }

    private int findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
