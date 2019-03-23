package pl.sdacademy.beginner.JFrame.zad1;

import javax.swing.*;

public class Okno2 {
    private static JFrame frame;
    private static JTextField textField;

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

    private static void addElements() {
        preperTextField();
    }

    private static void preperTextField() {
        textField = new JTextField("Cos ");
        textField.setBounds(50, 50, 100, 50);
        frame.add(textField);
    }

    protected static String getTextField() {
        return textField.getText();
    }

}
