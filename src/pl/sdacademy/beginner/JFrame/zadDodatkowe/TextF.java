package pl.sdacademy.beginner.JFrame.zadDodatkowe;

import javax.swing.*;

public class TextF {
    private JTextField textField;

    protected TextF() {
        preperTextField();
    }

    private void preperTextField() {
        textField = new JTextField();
        textField.setBounds(50, 480, 700, 50);
    }

    protected JTextField getTextField() {
        return textField;
    }

    protected String getTextFromField() {
        return textField.getText();
    }
}
