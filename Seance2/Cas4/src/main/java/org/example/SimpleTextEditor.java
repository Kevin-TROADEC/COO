package org.example;

import org.example.interfaces.Document;

public class SimpleTextEditor extends Application{

    public Document createDocument(){

        System.out.println("Create ASCII Document");
        return new ASCIIDocument();
    }

    @Override
    public void save() {
        System.out.println("Save ASCII Document");
    }
}
