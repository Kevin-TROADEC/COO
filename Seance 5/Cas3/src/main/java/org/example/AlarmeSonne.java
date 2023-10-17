package org.example;

import org.example.interfaces.State;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AlarmeSonne extends State {
    AlarmeSonne(Alarme alarme){
        super(alarme);
    }

    @Override
    public String onEnable() {
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
        Thread t1 = new Thread(new AlarmeOff(alarme).new RunnableAlarme());
        t1.start();
        return "Alarm stopped";
    }
}
