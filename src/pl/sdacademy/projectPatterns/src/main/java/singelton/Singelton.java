package pl.sdacademy.projectPatterns.src.main.java.singelton;

import javax.swing.*;

public class Singelton extends JFrame {
    private static final Singelton singleton = new Singelton(100,100, "Welcome!");

    private int widht;
    private int height;
    private String welcomeText;

    Singelton(int widht, int height, String welcomeText){
        this.height=height;
        this.welcomeText=welcomeText;
        this.widht=widht;

    }




}
