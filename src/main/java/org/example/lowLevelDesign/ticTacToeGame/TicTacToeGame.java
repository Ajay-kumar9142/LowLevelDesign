package org.example.lowLevelDesign.ticTacToeGame;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;

    Board gamingBoard;

    static TicTacToeGame instance;

    public void initilizeGame(){
        players = new LinkedList<>();

        PlayingPiece o = new PlayingPieceO();
        PlayingPiece x = new PlayingPieceX();
        Player player1 = new Player("player1", o);
        Player player2 = new Player("player2", x);

        players.add(player1);
        players.add(player2);

        gamingBoard = new Board(3);
    }

    public static final TicTacToeGame getInstance(){
        if(instance == null) instance = new TicTacToeGame();
        return instance;
    }

    public String startGame(){

        boolean noWinner = true;
        while(noWinner){

            //take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();

            //get the free space from the board
            gamingBoard.printGameBoard();
            List<List<Integer>> freeSpaces =  gamingBoard.getFreeCells();
            if(freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            //read the user input
            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);


            //place the piece
            boolean pieceAddedSuccessfully = gamingBoard.addPieces(inputRow,inputColumn, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if(winner) {
                return playerTurn.name;
            }
        }

        return "tie";

    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gamingBoard.getSize();i++) {

            if(gamingBoard.getGameBoard()[row][i] == null || gamingBoard.getGameBoard()[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gamingBoard.getSize();i++) {

            if(gamingBoard.getGameBoard()[i][column] == null || gamingBoard.getGameBoard()[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gamingBoard.getSize();i++,j++) {
            if (gamingBoard.getGameBoard()[i][j] == null || gamingBoard.getGameBoard()[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gamingBoard.getSize()-1; i<gamingBoard.getSize();i++,j--) {
            if (gamingBoard.getGameBoard()[i][j] == null || gamingBoard.getGameBoard()[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
