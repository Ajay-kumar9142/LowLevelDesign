package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.weatherMonitor;

public class CurrentWeatherCond implements Observer{
    @Override
    public void update(double tempreture, double pressure, double humidity) {
        System.out.println("tempreture : "+tempreture+"  "+"pressure : "+pressure+"  "+"humidity : "+humidity);
    }
}
