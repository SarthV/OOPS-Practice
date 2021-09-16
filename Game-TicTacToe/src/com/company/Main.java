package com.company;

public class Main {

    public static void main(String[] args) {
        TicTacToe.startGame();
        Player player1 = new Player("Sarth", 'x', 1);
        Player player2 = new Player("Parth", 'o', 0);
        //Assume "X" starts the game first
        System.out.println();
        TicTacToe.move(player1,1,0);
        System.out.println();
        TicTacToe.move(player2,0,2);
        //And so the game moves on!

    }
}
