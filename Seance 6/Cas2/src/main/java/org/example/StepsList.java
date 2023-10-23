package org.example;

import org.example.interfaces.Component;
import org.example.interfaces.Mediator;

import javax.swing.*;

@SuppressWarnings("unchecked")
public class StepsList extends JList implements Component {
    private Mediator mediator;

    private final DefaultListModel LIST_MODEL;


    public StepsList(DefaultListModel listModel) {
        super(listModel);
        this.LIST_MODEL = listModel;
        setModel(listModel);
        this.setLayoutOrientation(JList.VERTICAL);

    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "StepsList";
    }


    public void addElement(Step step) {
        LIST_MODEL.addElement(step.toString());
        int index = LIST_MODEL.size() - 1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
    }

    public void deleteElement() {
        int index = this.getSelectedIndex();
        try {
            LIST_MODEL.remove(index);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
    }

    public DefaultListModel getLIST_MODEL() {
        return LIST_MODEL;
    }
}
