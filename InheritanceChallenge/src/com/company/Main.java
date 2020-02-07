package com.company;

public class Main {

    public static void main(String[] args) {
        Pontiac pontiac = new Pontiac(36);
        pontiac.steer(45);
        pontiac.accelerate(30);
        pontiac.accelerate(20);
        pontiac.accelerate(-42);
    }
}
