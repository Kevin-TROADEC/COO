package org.example;

import org.example.interfaces.Mediator;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {

        Mediator mediator = new Editor();

        mediator.registerComponent(new RecipeName());
        mediator.registerComponent(new PreparationTime());
        mediator.registerComponent(new PrintButton());
        mediator.registerComponent(new IngredientList(new DefaultListModel()));
        mediator.registerComponent(new StepDescription());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new StepsList(new DefaultListModel()));
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new ToUpButton());
        mediator.registerComponent(new ToBottomButton());

        mediator.createGUI();

    }
}