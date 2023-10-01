package org.example;

import org.example.interfaces.Document;

public abstract class Application {

    public Document createDocument(){
        Document document = createDocument();
        document.save();
        return document;
    }

    public abstract void save();
}
