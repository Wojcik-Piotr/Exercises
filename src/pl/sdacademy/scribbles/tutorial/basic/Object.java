package pl.sdacademy.scribbles.tutorial.basic;

import javax.swing.*;

public class Object {
    public static void main(String[] angs) {
        int number=5;
        JFrame window= new JFrame();//tworzymy okno
        window.setTitle("My Window");//nazywamy okno
        window.setSize(800, 600);//okreslamy parametry okna
        window.setVisible(true); //wyśfietlamy okno

        JLabel label=new JLabel();//tworzymy etykiete
        label.setText("My Label");//tekst etykiety

        window.add(label);//dodajemy etykiete do okna

        String s="Hi";
    }
}
