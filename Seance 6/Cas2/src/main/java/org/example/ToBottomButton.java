package org.example;

import org.example.interfaces.Component;
import org.example.interfaces.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ToBottomButton extends JButton implements Component {

    private Mediator mediator;

    public ToBottomButton(){
        super("Vers le bas");
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.move_step_down();
    }

    @Override
    public String getName() {
        return "ToBottomButton";
    }
}
