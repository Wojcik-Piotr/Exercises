package pl.sdacademy.projectPatterns.src.main.java.Template;

public class Main {
    private static Game game = new Football();

    public static void main(String[] args) {
        game.play();
    }
}
