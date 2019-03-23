package pl.sdacademy.beginner.JFrame.zad2;

import javax.swing.*;

public class Okno {
    private static JFrame frame;
    private static JButton button, ok;
    private static JLabel label, label1;
    private static JTextField textField;
    private static Okno2 okno2=new Okno2();
    private static JDialog dialog;

    protected static void setFrame() {
        prepereFrame();
        frame.setVisible(true);
        button.addActionListener(e -> setLabel(weryfikuj(getTxt())));
    }

    private static void prepereFrame() {
        frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(null);
        addElements();
    }


    private static void prepereDialog(){
        dialog=new JDialog();
        dialog.setSize(100,200);
        dialog.setLayout(null);
        prepereOk();
        preperLabel1();
    }
    private static void showDialog(){
        prepereDialog();
        dialog.setVisible(true);
        ok.addActionListener(e -> dialog.setVisible(false));
    }

    private static void prepereOk() {
        ok=new JButton("OK");
        ok.setBounds(0,100,100,100);
        dialog.add(ok);
    }

    private static void prepereLogin() {
        button = new JButton("Login");
        button.setBounds(50, 250, 200, 100);
        frame.add(button);
    }

    private static void preperLabel() {
        label = new JLabel("Podaj Hasło: ");
        label.setBounds(50, 50, 200, 50);
        frame.add(label);
    }
    private static void preperLabel1() {
        label1 = new JLabel("Błędne Hasło! ");
        label1.setBounds(0, 0, 200, 100);
        dialog.add(label1);
    }

    private static void preperTextField() {
        textField = new JTextField();
        textField.setBounds(50, 150, 100, 50);
        frame.add(textField);
    }

    private static void addElements() {
        preperLabel();
        prepereLogin();
        preperTextField();
    }

    private static String getTxt() {
        return textField.getText();
    }

    private static void setLabel(boolean a) {
        if (a) {
            frame.setVisible(false);
            okno2.setFrame();
        } else {
            showDialog();
        }
    }

    private static boolean weryfikuj(String haslo) {
        if (haslo.equals("mikrus")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        setFrame();
    }

}
