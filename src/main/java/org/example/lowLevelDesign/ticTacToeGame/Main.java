package org.example.lowLevelDesign.ticTacToeGame;

public class Main {

    public static void main(String[] args) {
        TicTacToeGame game = TicTacToeGame.getInstance();
        game.initilizeGame();
        System.out.println(game.startGame());
    }
}
