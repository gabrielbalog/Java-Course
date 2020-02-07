package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player1 = new Player();
//        player1.name = "Tim";
//        player1.health = 20;
//        player1.weapon = "Sword";
//
//        int damage = 10;
//
//        player1.loseHealth(damage);
//        System.out.println("Remaining health " + player1.healthRemaining());
//
//        damage = 11;
//
//        player1.health = 200;
//        player1.loseHealth(damage);
//        System.out.println("Remaining health " + player1.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 150, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
