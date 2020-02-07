package com.company;

public class BaseBurger {
    private String breadRollType;
    private String name;
    private String meat;
    private Lettuce lettuce;
    private Tomato tomato;
    private Carrot carrot;
    private double price;
    private int additionalItems;

    public BaseBurger(String breadRollType, String name, String meat, double price) {
        this.breadRollType = breadRollType;
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.additionalItems = 4;
        this.lettuce = new Lettuce();
        this.tomato = new Tomato();
        this.carrot = new Carrot();
    }

    public void showPrice() {
        System.out.println("--------");
        double totalPrice = 0;
        if (this.lettuce.getQuantity() > 0 ) {
            totalPrice += this.lettuce.getPrice();
            System.out.println("Lettuce: " + this.lettuce.getPrice());
        }
        if (this.tomato.getQuantity() > 0 ) {
            totalPrice += this.tomato.getPrice();
            System.out.println("Tomato: " + this.tomato.getPrice());
        }
        if (this.carrot.getQuantity() > 0 ) {
            totalPrice += this.carrot.getPrice();
            System.out.println("Carrot: " + this.carrot.getPrice());
        }
        System.out.println("--------");
        System.out.println("Total: " + (price + totalPrice));
    }

    private boolean addAdditional() {
        if (additionalItems > 0) {
            this.additionalItems -= 1;
            return true;
        } else {
            System.out.println("You cant add more additional");
            return false;
        }
    }

    public void addLettuce() {
        if (addAdditional()) {
            this.lettuce.addQuantity(1);
        }
    }
    public void addTomato() {
        if (addAdditional()) {
            this.tomato.addQuantity(1);
        }
    }
    public void addCarrot() {
        if (addAdditional()) {
            this.carrot.addQuantity(1);
        }
    }
}
