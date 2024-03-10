package org.design_patterns.strategy;

public class Cash implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying with cash...");
    }
}
