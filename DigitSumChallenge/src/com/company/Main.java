package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(735));
    }
    
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

//        do {
//            sum += number % 10;
//            number = number / 10;
//        } while (number != 0);

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
