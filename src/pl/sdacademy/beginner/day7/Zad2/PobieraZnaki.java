package pl.sdacademy.beginner.day7.Zad2;

import java.util.Scanner;

public class PobieraZnaki implements Runnable {
    private Scanner scanner = new Scanner(System.in);
    private String text;
    private final Obliczenia obliczenia;

    public PobieraZnaki(Obliczenia obliczenia) {
        this.obliczenia = obliczenia;
    }


    @Override
    public void run() {
        boolean warunek = true;
        while (warunek) {
            System.out.println("Wpisz coś. Jeśli chcesz zakończyć napisz: exit");
            text = scanner.nextLine();
            if (text.equalsIgnoreCase("exit")) {
                warunek = false;
            } else {
                warunek = true;
                System.out.println(obliczenia.geti());
            }
        }
    }
}
