package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Alarme alarme = new Alarme();
        UI ui = new UI(alarme);
        alarme.setUi(ui);
        ui.init();
    }
}
