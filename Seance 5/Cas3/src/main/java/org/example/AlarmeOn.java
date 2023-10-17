package org.example;

import org.example.interfaces.State;

public class AlarmeOn extends State {

    AlarmeOn(Alarme alarme){
        super(alarme);
    }

    @Override
    public String onEnable(int seconde) {
        return "Alarm is already on";
    }

    @Override
    public String onDisable() {
        alarme.changeState(new AlarmeOff(alarme));
        return"Disable Alarm";
    }

    @Override
    public String onRing() {
        alarme.changeState(new AlarmeSonne(alarme));
        return "Alarm is ringing !";
    }

    @Override
    public String onStop() {
        return "Alarm is not ringing, it can't be stopped";
    }

}
