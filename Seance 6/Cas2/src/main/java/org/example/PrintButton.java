package org.example;

import org.example.interfaces.Component;
import org.example.interfaces.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PrintButton extends JButton implements Component {

    private Mediator mediator;

    public PrintButton(){
        super("Imprimer recette");
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.check_print_recipe();
    }

    @Override
    public String getName() {
        return "PrintButton";
    }
}
