package com.company;

public class TicTacToe {
    static char[][] board;
    final static int n = 3;
    static Player winner;
    static char currChance = 'x';

    public static void startGame(){
        board = Board.initializeGame(n);
    }
    public static int move(Player player, int row, int col) throws IllegalArgumentException{
        if(row < 0 || row >= n || col < 0 || col >= n){
            throw new IllegalArgumentException("Invalid move");
        }
        if(board[row][col] != ('_')){
            throw new IllegalArgumentException("Already taken");
        }
        if(player.id != 0 && player.id != 1){
            throw new IllegalArgumentException("Invalid player");
        }
        if(player.letter != (currChance)){
            throw new IllegalArgumentException("Not your chance");
        }
        else{
            boolean winRow = true;
            boolean winCol = true;
            boolean winDia = true;
            boolean winRevDia = true;
            board[row][col] = player.letter;
            for(int i =  0 ; i < n ; i++){
                if(board[row][i] != (player.letter)){
                    winRow = false;
                }
                if(board[i][col] != (player.letter)){
                    winCol = false;
                }
                if(row == col){
                    if(board[i][i] != ((player.letter))){
                        winDia = false;
                    }
                }
                if(row + col == n - 1){
                    if(board[n-1-i][i] != ((player.letter))){
                        winRevDia = false;
                    }
                }
            }
            Board.printBoard(board);
            //Change the currChance variable for the next player's turn
            if(currChance == 'x'){
                currChance = 'o';
            }
            else{
                currChance = 'x';
            }

            if(winRow || winCol || winRevDia || winDia){
                winner = player;
                return 1;
            }
        }
        return -1;
    }

    public Player getWinner(){
        return winner;
    }
}
