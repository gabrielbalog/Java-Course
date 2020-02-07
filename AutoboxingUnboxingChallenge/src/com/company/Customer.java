package com.company;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(String name, Double initialTransaction) {
        this.transactions.add(initialTransaction);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Double value) {
        this.transactions.add(value);
    }

    public void getTransactions() {
        if (this.transactions.size() > 0 ) {
            for (int i = 0; i<this.transactions.size(); i++) {
                System.out.println("Customer: Transaction #" + (i+1) + ": $" + this.transactions.get(i));
            }
        } else {
            System.out.println("Customer: This customer don't have any transactions");
        }
    }
}
