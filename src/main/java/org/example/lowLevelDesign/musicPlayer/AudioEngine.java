package org.example.lowLevelDesign.musicPlayer;

public class AudioEngine {
    public void play(Song song){
        System.out.println("playing : " + song.getTitle());
    }

    public void stop(){
        System.out.println("stopped");
    }
}
