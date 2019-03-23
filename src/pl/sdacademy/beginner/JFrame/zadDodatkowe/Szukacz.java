package pl.sdacademy.beginner.JFrame.zadDodatkowe;

import javax.swing.*;

public class Szukacz {
    private static JButton button;

    protected Szukacz() {
        preperButton();
    }

    private static void preperButton() {
        button = new JButton("Szukaj");
        button.setBounds(50, 540, 700, 50);
    }

    protected static JButton getButton() {
        return button;
    }

}
