package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 10;
        short myShortValue = 555;
        int myIntValue = 129192;

        long myLongTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println(myLongTotal);
    }
}
