package pl.sdacademy.beginner.day7.JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    static int licznik = 1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 200);
        frame.setLayout(null);
        JButton button = new JButton("Hello World");
        button.setBounds(50, 50, 150, 100);
        frame.add(button);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                button.setText("Clicked! " + licznik++);
            }
        });
    }


}
