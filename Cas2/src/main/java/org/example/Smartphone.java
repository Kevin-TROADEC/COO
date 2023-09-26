package org.example;

import org.example.interfaces.Manufacturer;

public class Smartphone extends AbstractPhone{


    public Smartphone(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void camera(){

        System.out.println("Open Camera!");
    }

    public void internet(){

        System.out.println("Open Browser!");
    }
}
