package com.company;

public class Main {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimun Value = " + myMinIntValue);
        System.out.println("Integer Maximun Value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxValueInt = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        long myMaxValueLong = 2_147_483_647_1221L;


        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2); // Cast Int -> Byte
        short myNewShortValue = (short) (myMinShortValue / 2); // Cast Int -> Short

        byte myByteValue = 10;
        short myShortValue = 555;
        int myIntValue = 129192;

        long myLongTotal = 50000 + (10 * (myByteValue + myShortValue + myIntValue));
        System.out.println(myLongTotal);
    }
}
