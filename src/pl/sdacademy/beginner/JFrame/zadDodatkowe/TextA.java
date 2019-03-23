package pl.sdacademy.beginner.JFrame.zadDodatkowe;

import javax.swing.*;

public class TextA {
    private JTextArea textArea;

    protected TextA() {
        peperTextArea();
    }

    private void peperTextArea() {
        textArea = new JTextArea();
        textArea.setBounds(10, 60, 780, 300);
    }

    protected JTextArea getTextArea() {
        return textArea;
    }

    protected String getTextfFtomArea() {
        return textArea.getText();
    }
}
