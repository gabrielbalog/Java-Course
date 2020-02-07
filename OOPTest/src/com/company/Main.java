package com.company;

public class Main {

    public static void main(String[] args) {
        BaseBurger baseBurger = new BaseBurger("Normal", "Monster Burger", "Raw", 20.0);
        baseBurger.addLettuce();
        baseBurger.addLettuce();
        baseBurger.addLettuce();
        baseBurger.showPrice();
    }
}
