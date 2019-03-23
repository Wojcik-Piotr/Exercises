package pl.sdacademy.projectPatterns.src.main.java.Chain;

public interface Handler {
    int handle(int money);

    Handler nexHandler();
}
