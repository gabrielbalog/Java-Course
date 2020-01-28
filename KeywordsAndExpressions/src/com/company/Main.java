package com.company;

public class Main {

    public static void main(String[] args) {
        int myVar = 50;
        myVar++;
        myVar--;

        System.out.println("This is a test");

        System.out.println("This is" +
                "another" +
                "still more");

        int anotherVar = 50;
        myVar--;
        System.out.println("This is another");

// -------------------------------------------

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score >= 1000) {
            System.out.println("Your score was less 5000 and greater than 1000");
        } else if (score < 1000) {
            System.out.println("Score less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus); // Somente disponivel dentro do code block
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
