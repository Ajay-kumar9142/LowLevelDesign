package org.example.lowLevelDesign.ticTacToeGame;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Board {

    private final int size;

    private PlayingPiece[][] gameBoard;

    public Board(final int size){
        this.size = size;
        this.gameBoard = new PlayingPiece[size][size];
    }

    public boolean addPieces(int row, int column, PlayingPiece playingPiece){
        if(gameBoard[row][column] != null) {
            return false;
        }
        gameBoard[row][column] = playingPiece;
        return true;

    }

    public List<List<Integer>> getFreeCells(){
        List<List<Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (gameBoard[i][j] == null) {
                    List<Integer> rowColumn = List.of(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;

    }

    public void printGameBoard(){
        //logic
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (gameBoard[i][j] != null) {
                    System.out.print(gameBoard[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }

    }

}
