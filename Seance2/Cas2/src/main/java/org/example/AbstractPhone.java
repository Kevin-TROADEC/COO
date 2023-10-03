package org.example;

import org.example.interfaces.Manufacturer;

public abstract class AbstractPhone {
    public Manufacturer manufacturer;

    public void call(){
        System.out.println("Calling!");
    }

    public void message(){
        System.out.println("Messaging!");
    }
}
