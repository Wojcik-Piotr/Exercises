package pl.sdacademy.beginner.JFrame.zad1;

import javax.swing.*;

public class Okno {
    private static JFrame frame;
    private static JButton button;
    private static JLabel label;
    private static JTextField textField;
    private static Okno2 okno2 = new Okno2();

    protected static void setFrame() {
        okno2.setFrame();
        prepereFrame();
        frame.setVisible(true);
        button.addActionListener(e -> setLabel(getTxt() + " " + okno2.getTextField()));
    }

    private static void prepereFrame() {
        frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(null);
        addElements();
    }

    private static void prepereBatton() {
        button = new JButton("Połącz");
        button.setBounds(50, 250, 200, 100);
        frame.add(button);
    }

    private static void preperLabel() {
        label = new JLabel();
        label.setBounds(50, 150, 100, 50);
        frame.add(label);
    }

    private static void preperTextField() {
        textField = new JTextField("cos ");
        textField.setBounds(50, 50, 100, 50);
        frame.add(textField);
    }

    private static void addElements() {
        preperLabel();
        prepereBatton();
        preperTextField();
    }

    private static String getTxt() {
        return textField.getText();
    }

    protected static void setLabel(String txt) {
        label.setText(txt);
    }

    public static void main(String[] args) {
        setFrame();
    }



}
