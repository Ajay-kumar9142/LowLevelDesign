package org.example.lowLevelDesign.musicPlayer;

public class Main {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.addSong(new Song("sanam teri kasam", "unknown", 240));
        playList.addSong(new Song("Radha Radha jap", "unknown", 500));

        MusicPlayer player = new MusicPlayer(playList);
        player.setPlayerState(new PlayingState());
        player.setPlayStrategy(new NormalPlayStrategy());

        player.play();
    }
}
