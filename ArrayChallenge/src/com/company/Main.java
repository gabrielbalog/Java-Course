package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        printArray(sortIntegers(myIntegers));
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " int values.\r");
        int[] array = new int[capacity];

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] sortIntegers(int[] array) {
//        int[] newArray = array;
        int[] newArray = Arrays.copyOf(array, array.length);

        for (int x=0; x<array.length -1; x++) {
            for (int y=x+1; y<array.length; y++) {
                if (newArray[x] < newArray[y]) {
                    int temp = newArray[x];
                    newArray[x] = newArray[y];
                    newArray[y] = temp;
                }
            }
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
}
