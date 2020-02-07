package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<>();
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addCustomer(Customer customer) {
        int position = findCustomer(customer);
        if (position < 0) {
            customers.add(customer);
            System.out.println("Branch: Customer created!");
            return true;
        }
        System.out.println("Branch: Customer already in the database!");
        return false;
    }

    public boolean addTransactionToCustomer(Customer customer, Double value) {
        int position = findCustomer(customer);
        if (position >= 0) {
            addTransactionToCustomer(position, value);
            System.out.println("Branch: Customer found! Adding transaction in the value of: $" + value);
            return true;
        }
        System.out.println("Branch: Customer not found!");
        return false;
    }

    private void addTransactionToCustomer(int position, Double value) {
        customers.get(position).addTransaction((value));
    }

    private int findCustomer(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customer.getName())) {
                return i;
            }
        }
        return -1;
    }

    public void printCostumers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("Branch: Costumer #" + (i + 1) + ": " + customers.get(i).getName());
        }
    }

    public void printTransactionsForCustomer(Customer customer) {
        int position = findCustomer(customer);
        if (position >= 0) {
            customers.get(position).getTransactions();
        } else {
            System.out.println("Branch: Customer not found for this branch (" + this.name + ")");
        }
    }
}
