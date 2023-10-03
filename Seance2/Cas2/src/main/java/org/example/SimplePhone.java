package org.example;

import org.example.interfaces.Manufacturer;

public class SimplePhone extends AbstractPhone{

    public SimplePhone(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
