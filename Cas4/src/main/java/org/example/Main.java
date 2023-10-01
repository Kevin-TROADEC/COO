package org.example;

import org.example.interfaces.Document;

public class Main {
    public static void main(String[] args) {
        Application simpleTextEditor = new SimpleTextEditor();
        Document steDoc= simpleTextEditor.createDocument();
        
        Application pdfEditor = new PDFEditor();
        Document pdfeDoc= pdfEditor.createDocument();

        steDoc.save();
        pdfeDoc.save();
    }
}