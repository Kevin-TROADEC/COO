package org.example;

import org.example.interfaces.State;

public class Alarme {
    private UI ui = null;
    Alarme(){
        this.state = new AlarmeOff(this);
    }

    private State state;

    public void changeState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public UI getUi() {
        return ui;
    }

    public void setUi(UI ui) {
        this.ui = ui;
    }
}