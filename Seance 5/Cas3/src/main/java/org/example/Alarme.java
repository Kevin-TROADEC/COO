package org.example;

import org.example.interfaces.State;

import java.time.LocalTime;

public class Alarme {
    private UI ui = null;
    private State state;
    LocalTime alarmTime;
    Alarme(){
        this.state = new AlarmeOff(this);
    }

    public LocalTime getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

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