package org.example;

import org.example.interfaces.Chargeable;

public class LightningSmartphone implements Chargeable {

    @Override
    public void charger() {

        System.out.println("Charging Lightning phone");
    }
}
