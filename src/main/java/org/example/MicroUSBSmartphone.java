package org.example;

import org.example.interfaces.Chargeable;

public class MicroUSBSmartphone implements Chargeable {

    @Override
    public void charger() {

        System.out.println("Charging Micro-USB phone");
    }
}
