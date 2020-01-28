package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstDouble = 20d;
	    double secondDouble = 80d;
	    double sumDouble = (firstDouble + secondDouble) * 100;

	    double remainder = sumDouble % 40d;

	    boolean remainderBoolean = (remainder == 0) ? true : false;

        System.out.println("remainderBoolean " + remainderBoolean);

        if (!remainderBoolean) {
            System.out.println("Got some remainder");
        }
    }
}
