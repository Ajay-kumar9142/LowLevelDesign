package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.weatherMonitor;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
