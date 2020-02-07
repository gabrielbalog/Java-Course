package com.company;

import java.util.ArrayList;

class IntClass {
    private int myInt;

    public IntClass(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

//        ArrayList<int> intClassArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(5));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(121.54);


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i= 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

//        for (int i= 0; i < 10; i++) {
//            System.out.println(i + " -> " + integerArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (double dbl=0.0; dbl<=10.0; dbl+=0.5) {
            doubleArrayList.add(dbl);
        }

        for (int i=0; i<doubleArrayList.size(); i++) {
            double value = doubleArrayList.get(i);
            System.out.println(i + " -> " + value);
        }
    }
}
