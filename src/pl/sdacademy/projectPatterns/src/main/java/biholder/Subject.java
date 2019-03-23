package pl.sdacademy.projectPatterns.src.main.java.biholder;

import java.io.IOException;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubskribers(int messenge) throws IOException;
}
