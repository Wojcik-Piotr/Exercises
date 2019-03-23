package pl.sdacademy.projectPatterns.src.main.java.Template;

public class Cryciet extends Game {
    @Override
    void prepereFild() {
        System.out.println("Przygotowanie boiska do crycieta");
    }

    @Override
    void endGame() {
        System.out.println("Wygrywa cryciet");
    }
}
