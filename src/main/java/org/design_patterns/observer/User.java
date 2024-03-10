package org.design_patterns.observer;

public class User implements Observer {

    private String name;
    private Product product;


    public User(String name, Product product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void update(Product product) {
        System.out.println("Product is available");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", product=" + product +
                '}';
    }
}
