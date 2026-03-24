package org.example.lowLevelDesign.ticTacToeGame;

public class Player {
    final String name;
    final PlayingPiece playingPiece;

    public Player(final String name, final PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }
}
