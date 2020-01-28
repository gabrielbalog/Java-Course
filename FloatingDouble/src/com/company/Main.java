package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimun value = " + myMinFloatValue);
        System.out.println("Float maximun value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimun value = " + myMinDoubleValue);
        System.out.println("Double maximun value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2;
        double myDoubleValue = 5d / 2;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 6d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(kilograms);

    }
}
