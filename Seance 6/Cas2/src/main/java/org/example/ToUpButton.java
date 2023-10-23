package org.example;

import org.example.interfaces.Component;
import org.example.interfaces.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ToUpButton extends JButton implements Component {

    private Mediator mediator;

    public ToUpButton(){
        super("Vers le haut");
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.move_step_up();
    }

    @Override
    public String getName() {
        return "ToUpButton";
    }
}