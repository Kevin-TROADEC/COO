package org.example;

import org.example.interfaces.State;

public class AlarmeOff extends State {

    AlarmeOff(Alarme alarme){
        super(alarme);
    }
    @Override
    public String onEnable(int seconde) {
        alarme.changeState(new AlarmeOn(alarme));
        Thread t1 = new Thread(new AlarmeOff(alarme).new RunnableAlarme());
        t1.start();
        return "Enable Alarm for " + seconde + " secondes";
    }

    @Override
    public String onDisable() {
        return "Alarm already disabled";
    }

    @Override
    public String onRing() {
        return "Alarm is off, it can't ring";
    }

    @Override
    public String onStop() {
        return "Alarm is off, it can't be stopped";
    }

    private class RunnableAlarme implements Runnable {

        public void run()
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(alarme.getState() instanceof AlarmeOn) {
                alarme.changeState(new AlarmeSonne(alarme));
                alarme.getUi().setTextfield("Alarm is ringing !");
            }
        }
    }
}
