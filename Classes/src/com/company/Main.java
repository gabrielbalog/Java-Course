package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

//        porsche.model = "Porsche";
        porsche.setModel("Porsche");
        System.out.println(porsche.getModel());

        porsche.setModel("Fiat");
        System.out.println(porsche.getModel());
    }
}
