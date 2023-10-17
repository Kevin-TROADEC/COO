package org.example;
import javax.swing.*;
import java.awt.*;

public class UI {
    private Alarme alarme;
    private static JTextField textField = new JTextField();

    public void setTextfield(String text){
        textField.setText(text);
    }
    public UI(Alarme alarme) {
        this.alarme = alarme;
    }

    public void init() {
        JFrame frame = new JFrame("Test Alarme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        JButton on = new JButton("On");
        on.addActionListener(e -> textField.setText(alarme.getState().onEnable(5)));
        JButton off = new JButton("Off");
        off.addActionListener(e -> textField.setText(alarme.getState().onDisable()));
        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> textField.setText(alarme.getState().onStop()));
        frame.setVisible(true);
        frame.setSize(300, 100);
        buttons.add(on);
        buttons.add(off);
        buttons.add(stop);
    }
}
