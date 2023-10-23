package org.example;

import org.example.interfaces.Component;
import org.example.interfaces.Mediator;

import javax.swing.*;

public class PreparationTime extends JTextField implements Component {

    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public String getName() {
        return "PreparationTime";
    }
}