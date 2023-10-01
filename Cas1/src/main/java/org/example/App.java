package org.example;

import org.example.interfaces.Chargeable;

public class App {
    public static void main(String[] args) {
        Chargeable simplePhone = new SimplePhone();
        StandardCharger standardCharger = new StandardCharger(simplePhone);
        standardCharger.connectPhone();

        Chargeable usbCPhone = new USBCSmartphone();
        StandardCharger usbCCharger = new USBCAdapter(usbCPhone);
        usbCCharger.connectPhone();

        Chargeable microUSBPhone = new MicroUSBSmartphone();
        StandardCharger microUSBCharger = new USBCAdapter(microUSBPhone);
        microUSBCharger.connectPhone();
    }
}
