package com.platzi.javatests.player;

public class Player {
    private Dice dado;
    private int minNumToWin;

    public Player(Dice dado, int minNumToWin) {
        this.dado = dado;
        this.minNumToWin = minNumToWin;
    }

    public boolean play(){
        int diceNumber =dado.roll();
        return diceNumber> minNumToWin;
    }
}
