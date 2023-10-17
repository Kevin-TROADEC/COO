package org.example;

import org.example.interfaces.State;

public class AlarmeSonne extends State {
    AlarmeSonne(Alarme alarme){
        super(alarme);
    }

    @Override
    public String onEnable(int seconde) {
        return "Alarm is already on and ringing";
    }

    @Override
    public String onDisable() {
        return "Alarm is ringing, it must be stopped before";
    }

    @Override
    public String onRing() {
        return "Alarm is already ringing";
    }

    @Override
    public String onStop() {
        alarme.changeState(new AlarmeOn(alarme));
        return "Alarm stopped";
    }


}
