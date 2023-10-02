package org.example;


import org.example.interfaces.Chargeable;

public class USBCAdapter extends StandardCharger {

    private USBCSmartphone phone;

    public USBCAdapter(USBCSmartphone phone) {
        this.phone = phone;
    }
}
