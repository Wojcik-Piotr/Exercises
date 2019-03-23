package pl.sdacademy.projectPatterns.src.main.java.Template;

public class Football extends Game {
    @Override
    void prepereFild() {
        System.out.println("Przyfotowanie boiska fo Football'u");
    }

    @Override
    void endGame() {
        System.out.println("Wygrywa football!");
    }
}
