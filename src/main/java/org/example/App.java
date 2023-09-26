package org.example;

import org.example.interfaces.Chargeable;

public class App {
    public static void main(String[] args) {
        Chargeable simplePhone = new SimplePhone();
        StandardCharger standardCharger = new StandardCharger(simplePhone);
        standardCharger.connectPhone();
    }
}
