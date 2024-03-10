package org.design_patterns.strategy;

public class Card implements PaymentStrategy{

    public void enterDetails() {
        System.out.println("Entering card details");
    }

    @Override
    public void pay() {
        enterDetails();
        System.out.println("Paying with card...");
    }
}
