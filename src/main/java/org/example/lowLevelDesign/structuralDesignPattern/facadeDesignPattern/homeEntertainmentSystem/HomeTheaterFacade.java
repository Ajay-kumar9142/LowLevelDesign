package org.example.lowLevelDesign.structuralDesignPattern.facadeDesignPattern.homeEntertainmentSystem;

public class HomeTheaterFacade {
    Tv tv;
    SoundSystem soundSystem;
    StreamingChannel streamingChannel;

    public HomeTheaterFacade(Tv tv, SoundSystem soundSystem, StreamingChannel streamingChannel){
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.streamingChannel = streamingChannel;
    }

    public void startMovieNight(){
        System.out.println("we are going to start movie night ......");
        tv.tvOn();
        soundSystem.soundSystemOn();
        streamingChannel.startStreaming();
    }

    public void endMovieNight(){
        tv.tvOff();
        soundSystem.soundSystemOff();
        streamingChannel.endStreaming();
        System.out.println("End the movie night with lots of fun ............");
    }
}
