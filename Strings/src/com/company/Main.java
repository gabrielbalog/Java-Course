package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "My String";

        System.out.println(myString);
        myString = myString + ", and this is more";

        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);


    }
}
