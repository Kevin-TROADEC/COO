package org.example;

import org.example.interfaces.Chargeable;

public class MicroUSBAdapter extends StandardCharger{

    private MicroUSBSmartphone phone;

    public MicroUSBAdapter(MicroUSBSmartphone phone) {
        this.phone = phone;
    }
}
