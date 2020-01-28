//    -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//    -Before the user enters the number, print the message gEnter number:h
//    -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//    Hint:
//    -Use an endless while loop.
//
//    Bonus:
//    -Create a project with the name MinAndMaxInputChallenge.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        while (true) {
            System.out.print("Enter number: " );
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int typedNumber = scanner.nextInt();

                if (typedNumber > max || max == 0) {
                    max = typedNumber;
                } else if (typedNumber < min || min == 0) {
                    min = typedNumber;
                }

                scanner.nextLine();
            } else {
                break;
            }
        }

        System.out.println("Min: " + min + " Max: " + max);

        scanner.close();
    }
}
