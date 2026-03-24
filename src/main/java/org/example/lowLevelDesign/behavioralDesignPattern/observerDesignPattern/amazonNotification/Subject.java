package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.amazonNotification;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
