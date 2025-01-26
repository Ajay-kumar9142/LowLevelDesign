package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.weatherMonitor;

public class StatiticsWeatherCond implements Observer{
    @Override
    public void update(double tempreture, double pressure, double humidity) {
        //some logical coding
        System.out.println("tempreture : "+(tempreture-10)+"  "+"pressure : "+(pressure-5)+"  "+"humidity : "+humidity);
    }
}
