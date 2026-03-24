package org.example.lowLevelDesign.musicPlayer;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        songs.add(song);
    }

    public Song getSong(int idx){
        return songs.get(idx);
    }

    public int size(){
        return songs.size();
    }
}
