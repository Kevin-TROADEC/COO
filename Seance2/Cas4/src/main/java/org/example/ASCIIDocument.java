package org.example;

import org.example.interfaces.Document;

public class ASCIIDocument implements Document {

    @Override
    public void save() {
        System.out.println("Save ASCII Document");
    }
}
