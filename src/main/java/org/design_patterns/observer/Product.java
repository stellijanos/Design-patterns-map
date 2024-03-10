package org.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {

    private String name;
    private int quantity;

    private final List<Observer> observers;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.observers = new ArrayList<>();
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

        if (quantity > 0) {
            notifyObservers();
        }
    }

    @Override
    public void addObserber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs: this.observers) {
            obs.update(this);
        }
    }
}
