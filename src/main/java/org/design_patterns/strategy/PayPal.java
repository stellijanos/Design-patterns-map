package org.design_patterns.strategy;

public class PayPal implements PaymentStrategy {

    public void authorize() {
        System.out.println("Authorising user...");
    }

    @Override
    public void pay() {
        authorize();
        System.out.println("Paying with PayPal...");
    }
}
