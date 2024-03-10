package org.design_patterns.adapter;

public class EUAdapter implements EUSocket {

    private USCharger usCharger;

    public EUAdapter(USCharger usCharger) {
        this.usCharger = usCharger;
    }

    @Override
    public void chargeEU() {
        usCharger.chargeUS();

        System.out.println("Adapter converts US socket to Eu socket");
    }
}
