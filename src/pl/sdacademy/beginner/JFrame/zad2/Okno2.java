package pl.sdacademy.beginner.JFrame.zad2;

import javax.swing.*;

public class Okno2 {
    private static JFrame frame;
    private static JTextField textField;
    private static JLabel label;

    protected static void setFrame() {
        prepereFrame();
        frame.setVisible(true);
    }

    private static void prepereFrame() {
        frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(null);
        addElements();
    }
    private static void preperLabel() {
        label = new JLabel("Tajna wiadomość ");
        label.setBounds(50, 50, 400, 200);
        frame.add(label);
    }


    private static void addElements() {
        preperTextField();
        preperLabel();
    }

    private static void preperTextField() {
        textField = new JTextField("Cos ");
        textField.setBounds(50, 200, 100, 50);
        frame.add(textField);
    }

}
