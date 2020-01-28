package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(500);
        calculateScore();

        double cent = calcFeetAndInchesToCentimeters(1,10);
        System.out.println(cent);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        return calcFeetAndInchesToCentimeters(feet * 12) + calcFeetAndInchesToCentimeters(inches);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0 || inches > 12) {
            return -1;
        }
        return inches * 2.54;
    }
}
