package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.amazonNotification;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    String name;
    boolean inStock;
    List<Observer> observers = new ArrayList<>();

    public Product(String name) {
        this.name = name;
        this.inStock = false;
    }
    @Override
    public void addObserver(Observer observer) {
       observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
     observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
      for(Observer observer : observers){
          observer.update(this.name);
      }
    }

    public void reStock() {
        System.out.println(name + "is restocked");
        this.inStock = true;
        notifyObservers();
    }
}
