package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Car -> Starting Engine");
    }

    public void accelerate() {
        System.out.println("Car -> Accelerate");
    }

    public void breakCar() {
        System.out.println("Car -> Break");
    }
}

class March extends Car {
    public March() {
        super(4, "March");
    }

    @Override
    public void startEngine() {
        System.out.println("March -> Starting Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("March -> Accelerate");
    }

    @Override
    public void breakCar() {
        System.out.println("March -> Break");
    }
}

class Pontiac extends Car {
    public Pontiac() {
        super(4, "Pontiac");
    }

    @Override
    public void startEngine() {
        System.out.println("Pontiac -> Starting Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Pontiac -> Accelerate");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(2, "Fusion");
        car.startEngine();
        car.accelerate();
        car.breakCar();

        Car march = new March();
        march.startEngine();
        march.accelerate();
        march.breakCar();

        Car pontiac = new Pontiac();
        pontiac.startEngine();
        pontiac.accelerate();
        pontiac.breakCar();
    }
}
