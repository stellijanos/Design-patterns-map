package org.design_patterns.builder;

public class CarBuilder {

    private String brand;
    private String model;
    private String color;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(brand, model, color);
    }
}
