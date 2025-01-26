package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.weatherMonitor;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers ;
    double tempreture;
    double pressure;
    double humidity;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
      observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
       for(Observer observer : observers){
           observer.update(tempreture, pressure, humidity);
       }
    }

    void setMeasurements(int tempreture, int pressure, int humidity){
        this.tempreture = tempreture;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
}
