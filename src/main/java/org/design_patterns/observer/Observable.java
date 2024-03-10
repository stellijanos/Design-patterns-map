package org.design_patterns.observer;

public interface Observable {
    public void addObserber(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
