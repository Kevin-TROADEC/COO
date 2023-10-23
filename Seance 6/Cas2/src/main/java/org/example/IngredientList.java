package org.example;

import org.example.interfaces.Component;
import org.example.interfaces.Mediator;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class IngredientList extends JList implements Component {

    private Mediator mediator;
    private final DefaultListModel LIST_MODEL;

    public IngredientList(DefaultListModel listModel){
        super(listModel);
        this.LIST_MODEL = listModel;
        setModel(listModel);
        this.setLayoutOrientation(JList.VERTICAL);
        LIST_MODEL.addAll(new ArrayList<String>(){
            {
                add("Oeufs");
                add("Farine");
                add("Sucre");
                add("Beure");
                add("Lait");
                add("Raisins secs");
                add("Levure");
                add("Eau");
            }
        });

        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {

                    // Double-click detected
                    mediator.add_ingredient((String) list.getSelectedValue());
                    System.out.println("double clic on " + list.getSelectedValue());
                }
            }
        });
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }




    @Override
    public String getName() {
        return "IngredientList";
    }

}
