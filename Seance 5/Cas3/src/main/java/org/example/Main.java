package org.example;

public class Main {

    public static void main(String[] args) {
        Alarme alarme = new Alarme();
        UI ui = new UI(alarme);
        alarme.setUi(ui);
        ui.init();
    }
}
