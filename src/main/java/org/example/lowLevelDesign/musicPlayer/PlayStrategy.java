package org.example.lowLevelDesign.musicPlayer;

public interface PlayStrategy {
    Song nextSong(PlayList playList);
}
