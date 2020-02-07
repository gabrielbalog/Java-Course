package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = readIntegers(5);
        System.out.println("The minimum value is " + findMin(myArray));
    }

    private static int[] readIntegers(int count) {
        System.out.println("Enter a number. \r");
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                minValue = array[i + 1];
            }
        }

        return minValue;
    }
}
