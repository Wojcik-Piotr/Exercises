package pl.sdacademy.beginner.JFrame.zad4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Texcik {
    private static JTextArea textArea;
    private static JFrame frame;
    private static JLabel label, wynik;
    private static JButton button;
    private static String text;

    private static void showFrame(){
        preperFrame();
        frame.setVisible(true);
        button.addActionListener(e -> showWynik());
    }
    private static void preperFrame(){
        createFrame();
        addElements();

    }
    private static void createFrame(){
        frame=new JFrame("My window");
        frame.setSize(800,600);
        frame.setLayout(null);
    }
    private static void addElements(){
        preperLabel();
        prepereButton();
        preperWynik();
        prepereTextAera();
    }
    private static void preperLabel(){
        label=new JLabel("Wpisz coś: ");
        label.setBounds(50,0,700,50);
        frame.add(label);
    }
    private static void preperWynik(){
        wynik=new JLabel("Wynik");
        wynik.setBounds(50,450,700,50);
        frame.add(wynik);
    }
    private static void prepereButton(){
        button=new JButton("Policz");
        button.setBounds(50,500, 700, 50);
        frame.add(button);
    }
    private static void prepereTextAera(){
        textArea=new JTextArea();
        textArea.setBounds(0, 50, 800, 400);
        frame.add(textArea);
    }
    private static int iloscLiter(){
        int iloscLiter=0;
        text=textArea.getText();
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)!=' '){
                iloscLiter++;
            }
        }
        return iloscLiter;
    }
    private static int iloscSlow(){
        String[] slowa= textArea.getText().split(" ");
        return slowa.length;
    }
    private static void showWynik(){
        wynik.setText("Ilość liter: "+iloscLiter()+", ilość słów: "+iloscSlow());
    }

    public static void main(String[] args) {
        showFrame();
    }
}
