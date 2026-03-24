package org.example.lowLevelDesign.musicPlayer;

public class PlayingState implements PlayerState{
    @Override
    public void play() {
        System.out.println("Already Playing");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}
