package pl.sdacademy.projectPatterns.src.main.java.singelton;

import javax.swing.*;

public class MainAppWindow extends JFrame{
    private static final MainAppWindow singleton = new MainAppWindow();

    private JButton button;


    MainAppWindow() {
        super("OKNO");
        this.button=new JButton("Button");
        this.add(button);
        this.setSize(200,200);
    }

    public static MainAppWindow getInstance() {
        return singleton;
    }

    public static void showVisible(){
        singleton.setVisible(true);
    }
}
