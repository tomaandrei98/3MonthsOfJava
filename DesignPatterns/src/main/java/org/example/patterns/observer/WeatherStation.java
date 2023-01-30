package org.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    int temperature = 0;
    List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver iObserver) {
        this.observers.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        this.observers.remove(iObserver);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
