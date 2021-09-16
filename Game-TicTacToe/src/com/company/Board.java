package com.company;

public class Board {
    int n;
    public static char[][] initializeGame(int n){
        char[][] board = {{'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}};
        printBoard(board);
        return board;
    }

    public static void printBoard(char[][] board){
        for(char[] row : board){
            for(char j : row){
                System.out.print(j);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
