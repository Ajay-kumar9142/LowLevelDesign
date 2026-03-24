package org.example.lowLevelDesign.musicPlayer;

public class MusicPlayer {
    AudioEngine audioEngine = new AudioEngine();
    PlayList playList;
    PlayStrategy playStrategy;
    PlayerState playerState;

    public MusicPlayer(PlayList playList){
        this.playList = playList;
    }

    public void setPlayerState(PlayerState playerState){
        this.playerState = playerState;
    }

    public void setPlayStrategy(PlayStrategy playStrategy){
        this.playStrategy = playStrategy;
    }

    public void play(){
        Song song = playStrategy.nextSong(playList);
        audioEngine.play(song);
        playerState.play();
    }

    public void pause(){
        playerState.stop();
    }

    public void stop(){
        audioEngine.stop();
        playerState.stop();
    }
}
