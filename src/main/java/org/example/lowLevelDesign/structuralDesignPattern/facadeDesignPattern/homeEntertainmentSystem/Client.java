package org.example.lowLevelDesign.structuralDesignPattern.facadeDesignPattern.homeEntertainmentSystem;

public class Client {

    public static void main(String[] args) {
        Tv tv = new Tv();
        SoundSystem soundSystem = new SoundSystem();
        StreamingChannel streamingChannel = new StreamingChannel();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv, soundSystem, streamingChannel);
        homeTheaterFacade.startMovieNight();
        homeTheaterFacade.endMovieNight();
    }

}
