package org.example;

import org.example.interfaces.Chargeable;
import org.example.interfaces.Charger;

public class StandardCharger implements Charger {
    Chargeable phone;

    public StandardCharger(Chargeable phone) {
        this.phone = phone;
    }

    public StandardCharger() {}

    public void connectPhone() {
        phone.charger();
    }
}
