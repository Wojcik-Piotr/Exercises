package pl.sdacademy.beginner.JFrame.zad3;

import javax.swing.*;
import java.awt.*;


public class Kalkulator {
    private static JFrame frame;
    private static JButton plus, minus;
    private static JLabel label, wynik;
    private static JTextField textField, textField1;

    protected static void setFrame() {
        prepereFrame();
        frame.setVisible(true);
        plus.addActionListener(e -> dodawanie(str2Int(getTxt(textField),textField),str2Int(getTxt(textField1),textField1)));
        minus.addActionListener(e -> odejmowanie(str2Int(getTxt(textField),textField),str2Int(getTxt(textField1),textField1)));
    }

    private static void prepereFrame() {
        frame = new JFrame("My Window");
        frame.setSize(400, 600);
        frame.setLayout(null);
        addElements();
    }

    private static void preperePlus() {
        plus = new JButton("+");
        plus.setBounds(50, 250, 100, 100);
        frame.add(plus);
    }
    private static void prepereMinus() {
        minus = new JButton("-");
        minus.setBounds(200, 250, 100, 100);
        frame.add(minus);
    }

    private static void preperLabel() {
        label = new JLabel("Podaj Liczby: ");
        label.setBounds(50, 50, 200, 50);
        frame.add(label);
    }
    private static void preperWynik() {
        wynik = new JLabel("Wynik: ");
        wynik.setBounds(150, 400, 200, 50);
        frame.add(wynik);
    }

    private static void preperTextField() {
        textField = new JTextField();
        textField.setBounds(50, 150, 100, 50);
        frame.add(textField);
    }
    private static void preperTextField1() {
        textField1 = new JTextField();
        textField1.setBounds(200, 150, 100, 50);
        frame.add(textField1);
    }
    private static void prepereBatton(){
        prepereMinus();
        preperePlus();
    }
    private static void prepereTextFields(){
        preperTextField();
        preperTextField1();
    }

    private static void addElements() {
        preperLabel();
        preperWynik();
        prepereBatton();
        prepereTextFields();
    }

    private static String getTxt(JTextField jTextField) {
        return jTextField.getText();
    }

    private static void dodawanie(int a, int b){
           wynik.setText(a + " + " + b + " = " + (a+b));

    }
    private static void odejmowanie(int a, int b){
        wynik.setText(a+" - "+b+" = "+(a+b));
    }
    private static Integer str2Int(String str, JTextField textField) {
        Integer result;
        if (null == str || 0 == str.length()) {
            textField.setBackground(Color.red);
            return 0;
        }
        try {
            result = Integer.parseInt(str);
            textField.setBackground(Color.white);
        }
        catch (NumberFormatException e) {
            textField.setBackground(Color.red);
            String negativeMode = "";
            if(str.indexOf('-') != -1)
                negativeMode = "-";
            str = str.replaceAll("-", "" );
            if (str.indexOf('.') != -1) {
                str = str.substring(0, str.indexOf('.'));
                if (str.length() == 0) {
                    return (Integer)0;
                }
            }
            String strNum = str.replaceAll("[^\\d]", "" );
            if (0 == strNum.length()) {
                return 0;
            }
            result = Integer.parseInt(negativeMode + strNum);
        }
        return result;
    }

    public static void main(String[] args) {
        setFrame();
    }
}
