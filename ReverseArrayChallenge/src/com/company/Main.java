package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Not reversed array: " + Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("Reversed array: " + Arrays.toString(myArray));
    }

    private static void reverse(int[] array) {
        int x = 0;
        int y = array.length - 1;
        while (x < y) {
            int temp = array[x];
            array[x] = array[y];
            array[y] = temp;
            x++;
            y--;
        }
    }
}
