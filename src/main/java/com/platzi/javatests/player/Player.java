package com.platzi.javatests.player;

public class Player {

    private Dice dice;
    private int minNumeroToWin;

    public Player(Dice dice, int minNumeroToWin) {
        this.dice = dice;
        this.minNumeroToWin = minNumeroToWin;
    }

    public boolean play(){
        int diceNumber = dice.roll();
        return diceNumber > minNumeroToWin;
    }
}
