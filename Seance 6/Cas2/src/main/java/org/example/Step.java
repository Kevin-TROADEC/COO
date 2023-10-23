package org.example;

import java.util.ArrayList;
import java.util.List;

public class Step {

    private int index;
    private String text;

    public List<String> getIngredientList() {
        return ingredientList;
    }

    private List<String> ingredientList = new ArrayList<String>();

    public Step(){
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public String toString() {
        return "Etape " + index + " : " + text;
    }


}
