package pl.sdacademy.beginner.day14.Boxs;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GenericBox<String> boxString = new GenericBox<String>();
    private static GenericBox<Integer> boxInt = new GenericBox<Integer>();
    private static GenericBox<Boolean> boxBoolin = new GenericBox<Boolean>();

    private static String setString() {
        System.out.println("Podaj słowo: ");
        return scanner.next();
    }

    private static void setBox(String string) {
        boxString.set(string);
        boxInt.set(string.length());
        boxBoolin.set(string.length() % 2 == 0);
    }

    private static void getBox() {
        System.out.println(boxString.get() + " ma " + boxInt.get() + " liter i jest parzysta: " + boxBoolin);
    }

    public static void main(String[] args) {
        setBox(setString());
        getBox();
    }
}
