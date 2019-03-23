package pl.sdacademy.beginner.JFrame.zadDodatkowe;

import javax.swing.*;

public class Frame {
    private static JFrame frame;
    private static TextF textF;
    private static TextA textA;

    protected static void showFrame() {
        preperFrame();
        frame.setVisible(true);
    }

    private static void preperFrame() {
        setFrame();
        addElement();
    }

    private static void addElement() {
        textA=new TextA();
        frame.add(textA.getTextArea());
        textF=new TextF();
        frame.add(textF.getTextField());
    }

    private static void setFrame() {
        frame = new JFrame("My window");
        frame.setSize(800, 600);
        frame.setLayout(null);
    }
}
