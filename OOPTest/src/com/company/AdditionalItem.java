package com.company;

public class AdditionalItem {
    private double price;
    private String name;
    private int quantity;

    public AdditionalItem(double price, String name) {
        this.price = price;
        this.name = name;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
}
