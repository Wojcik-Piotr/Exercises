package pl.sdacademy.projectPatterns.src.main.java.Template;

public abstract class Game {
    void inicjalize() {
        System.out.println("Przygotowanie zawodników, rozgrzewka");
    }

    abstract void prepereFild();

    void startGame() {
        System.out.println("GRAMY");
    }

    abstract void endGame();

    void play() {
        inicjalize();
        prepereFild();
        startGame();
        endGame();
    }
}
