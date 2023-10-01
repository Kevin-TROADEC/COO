package org.example;

import org.example.interfaces.Document;

public class PDFDocument implements Document {

    @Override
    public void save() {
        System.out.println("Save PDF Document");
    }
}
