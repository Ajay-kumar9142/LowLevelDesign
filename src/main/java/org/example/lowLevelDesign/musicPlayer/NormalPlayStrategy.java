package org.example.lowLevelDesign.musicPlayer;

public class NormalPlayStrategy implements PlayStrategy{
    private int idx = 0;
    @Override
    public Song nextSong(PlayList playList) {
        return playList.getSong(((idx)%(playList.size()))+1);
    }
}
