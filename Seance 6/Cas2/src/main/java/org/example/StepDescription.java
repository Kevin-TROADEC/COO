package org.example;

import org.example.interfaces.Component;
import org.example.interfaces.Mediator;

import javax.swing.*;

public class StepDescription extends JTextArea implements Component {

    private Mediator mediator;

    private Step step = new Step();


    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public String getName() {
        return "StepDescription";
    }

    public int getIngredientsNb() {
        return step.getIngredientList().size();
    }

    public Step getStep() {
        return this.step;
    }

    public void setStep(Step step) {
        this.step = step;
    }
}
