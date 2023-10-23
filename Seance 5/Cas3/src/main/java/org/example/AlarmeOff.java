package org.example;

import org.example.interfaces.State;

import java.time.LocalTime;

public class AlarmeOff extends State {

    AlarmeOff(Alarme alarme){
        super(alarme);
    }
    @Override
    public String onEnable() {
        String text = UI.getTextField().getText();
        alarme.changeState(new AlarmeOn(alarme));
        if(alarme.getAlarmTime() == null && text.isEmpty()){
            alarme.setAlarmTime(LocalTime.of(0,0));
            return "Enable Alarm for 00:00";
        }
        if(!text.isEmpty()){
            if(text.matches("\\d{2}:\\d{2}")){
                String[] time = text.split(":");
                alarme.setAlarmTime(LocalTime.of(Integer.parseInt(time[0]),Integer.parseInt(time[1])));
                Thread t1 = new Thread(new AlarmeOff(alarme).new RunnableAlarme());
                t1.start();
                return "Enable Alarm for " + alarme.getAlarmTime();
            } else if (alarme.getAlarmTime() != null) {
                return "Enable Alarm for " + alarme.getAlarmTime();
            } else {
                alarme.setAlarmTime(LocalTime.of(0,0));
                return "Enable Alarm for 00:00";
            }
        }
        alarme.setAlarmTime(LocalTime.of(0,0));
        return "Enable Alarm for 00:00";
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

    class RunnableAlarme implements Runnable {
        volatile boolean shutdown = false;
        public void run()
        {
            while(!shutdown)
            {
                int valueMin = LocalTime.now().compareTo(alarme.getAlarmTime());
                int valueMax = LocalTime.now().compareTo(alarme.getAlarmTime().plusSeconds(1));
                if(valueMin > 0 && valueMax < 0){
                    alarme.changeState(new AlarmeSonne(alarme));
                    alarme.getUi().setTextfield("Alarm is ringing !");
                }
                if(!(alarme.getState() instanceof AlarmeOn)){
                    shutdown = true;
                }
            }
        }
    }
}
