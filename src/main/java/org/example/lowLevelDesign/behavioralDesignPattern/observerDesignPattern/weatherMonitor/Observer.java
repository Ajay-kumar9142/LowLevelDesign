package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.weatherMonitor;

public interface Observer {
    void update(double tempreture, double pressure, double humidity);
}
