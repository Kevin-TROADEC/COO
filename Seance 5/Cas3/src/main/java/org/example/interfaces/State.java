package org.example.interfaces;

import org.example.Alarme;

public abstract class State {
    public Alarme alarme;

    protected State(Alarme alarme){
        this.alarme = alarme;
    }

    public abstract String onEnable(int seconde);
    public abstract String onDisable();
    public abstract String onRing();
    public abstract String onStop();



}
