//    -Read 10 numbers from the console entered by the user and print the sum of those numbers.
//    -Create a Scanner like we did in the previous video.
//    -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//    -If hasNextInt() returns false, print the message gInvalid Numberh. Continue reading until you have read 10 numbers.
//    -Use the nextInt() method to get the number and add it to the sum.
//    -Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
//    -For example, the first message printed to the user would be gEnter number #1:h, the next gEnter number #2: h, and so on.
//
//    Hint:
//    -Use a while loop.
//    -Use a counter variable for counting valid numbers.
//    -Close the scanner after you donft need it anymore.
//    -Create a project with the name ReadingUserInputChallenge.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    int sum = 0;
        Scanner scanner = new Scanner(System.in);

	    while (count <= 10) {
            System.out.print("Enter number #" + count + ": ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();

                count++;
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();

        System.out.println("The sum of all numbers are: " + sum);
    }
}
