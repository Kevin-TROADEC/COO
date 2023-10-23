package org.example;

import org.example.interfaces.Component;
import org.example.interfaces.Mediator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Editor implements Mediator {

    private RecipeName recipeName;
    private PreparationTime preparationTime;
    private PrintButton printButton;
    private IngredientList ingredientList;
    private StepDescription stepDescription;
    private AddButton addStepButton;
    private StepsList steps;
    private DeleteButton deleteButton;
    private ToUpButton toUpButton;
    private ToBottomButton toBottomButton;


    private JLabel receipeNameLabel = new JLabel("Nom de la recette:");
    private JLabel preparationTimeLabel = new JLabel("Temps de la préparation (min) :");
    private JLabel ingredientLabel = new JLabel("Ingredients :");
    private JLabel descriptionLabel = new JLabel("Description de l'étape :");
    private JLabel stepsLabel = new JLabel("Etapes :", SwingConstants.CENTER);

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "RecipeName":
                recipeName = (RecipeName)component;
                break;
            case "PreparationTime":
                preparationTime = (PreparationTime)component;
                break;
            case "IngredientList":
                ingredientList = (IngredientList)component;
                break;
            case "StepDescription":
                stepDescription = (StepDescription)component;
                break;
            case "AddButton":
                addStepButton = (AddButton)component;
                break;
            case "StepsList":
                steps = (StepsList)component;
                break;
            case "DeleteButton":
                deleteButton = (DeleteButton)component;
                break;
            case "ToUpButton":
                toUpButton = (ToUpButton)component;
                break;
            case "ToBottomButton":
                toBottomButton = (ToBottomButton)component;
                break;
            case "PrintButton":
                printButton = (PrintButton)component;
                break;
        }
    }


    @Override
    public boolean check_add_step() {
        if(!recipeName.getText().isEmpty() && recipeName.getText() != null){
            if(!preparationTime.getText().isEmpty() && preparationTime.getText() != null){
                if(stepDescription.getIngredientsNb() > 0){
                    return true;
                }
                else{
                    System.out.println("Il doit y avoir au moins un ingredient utilisé!");
                }
            }
            else {
                System.out.println("Le temps de préparation ne doit pas être vide !");
            }
        }
        else {
            System.out.println("Le nom de la recette ne dois pas être vide !");
        }
        return false;
    }

    @Override
    public void check_print_recipe() {

    }

    @Override
    public void add_step() {
        if(check_add_step()){
            Step step = stepDescription.getStep();
            step.setIndex(steps.getMaxSelectionIndex()+1);

            step.setText(stepDescription.getText());
            steps.addElement(step);
            stepDescription.setStep(new Step());
            stepDescription.setText("");

            System.out.println("Etape " + step.getIndex() + " ajoutée !");
        }
    }

    @Override
    public void move_step_down() {
    }

    @Override
    public void move_step_up() {

    }

    @Override
    public void remove_step() {
        steps.deleteElement();
    }

    @Override
    public void add_ingredient(String ingredient) {
        stepDescription.getStep().getIngredientList().add(ingredient);
        stepDescription.setText(stepDescription.getText() + ingredient + " ");
    }

    @Override
    public void createGUI() {
        JFrame recipesManager = new JFrame("Recettes Manager");
        recipesManager.setSize(800,600);
        recipesManager.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        receipeNameLabel.setBounds(20, 4, 150, 20);
        recipeName.setBounds(130, 5, 200, 20);
        preparationTimeLabel.setBounds(330, 4, 200, 20);
        preparationTime.setBounds(510, 5, 100, 20);
        printButton.setBounds(620,4, 150, 20);
        ingredientLabel.setBounds(20,30,150,20);
        ingredientList.setBounds(20,50,150,150);
        ingredientList.setBorder(new LineBorder(Color.BLACK));
        descriptionLabel.setBounds(180,30,450,20);
        stepDescription.setBounds(180,50,450,150);
        stepDescription.setBorder(new LineBorder(Color.BLACK));
        addStepButton.setBounds(640,50,130,150);
        stepsLabel.setBounds(20,200,750,20);
        steps.setBounds(20,220,750,300);
        steps.setBorder(new LineBorder(Color.BLACK));
        deleteButton.setBounds(140,530,150,20);
        toUpButton.setBounds(300,530,150,20);
        toBottomButton.setBounds(460,530,150,20);

        recipesManager.setLayout(null);
        recipesManager.getContentPane().add(receipeNameLabel);
        recipesManager.getContentPane().add(recipeName);
        recipesManager.getContentPane().add(preparationTimeLabel);
        recipesManager.getContentPane().add(preparationTime);
        recipesManager.getContentPane().add(printButton);
        recipesManager.getContentPane().add(ingredientLabel);
        recipesManager.getContentPane().add(ingredientList);
        recipesManager.getContentPane().add(descriptionLabel);
        recipesManager.getContentPane().add(stepDescription);
        recipesManager.getContentPane().add(addStepButton);
        recipesManager.getContentPane().add(stepsLabel);
        recipesManager.getContentPane().add(steps);
        recipesManager.getContentPane().add(deleteButton);
        recipesManager.getContentPane().add(toUpButton);
        recipesManager.getContentPane().add(toBottomButton);
        recipesManager.setResizable(false);
        recipesManager.setLocationRelativeTo(null);
        recipesManager.setVisible(true);


    }

}
