package com.company;

public class Main {

    public static void main(String[] args) {
/*
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;

        // Execute always once
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
*/

        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count >= 5) {
                break;
            }
            sum += number;
        }
        System.out.println("Founds = " + count);
        System.out.println("Sum = " + sum);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
