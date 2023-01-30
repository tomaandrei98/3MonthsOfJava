package org.example.patterns.observer;

public interface IObservable {
    void addObserver(IObserver iObserver);
    void removeObserver(IObserver iObserver);
    void notifyObservers();
}
