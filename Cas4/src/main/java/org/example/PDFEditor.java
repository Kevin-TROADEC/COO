package org.example;

import org.example.interfaces.Document;

public class PDFEditor extends Application{

    public Document createDocument(){
        System.out.println("Create PDF Document");
        return new PDFDocument();
    }

    @Override
    public void save() {
        System.out.println("Save PDF Document");
    }
}
