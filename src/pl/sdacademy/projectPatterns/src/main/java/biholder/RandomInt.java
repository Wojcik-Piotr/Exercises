package pl.sdacademy.projectPatterns.src.main.java.biholder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomInt implements Subject {
    Random random=new Random();
    private ArrayList<Observer> observers=new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubskribers(int messenge){
       observers.forEach(observer -> {
           try {
               observer.handleSubjectMessenge(messenge);
           } catch (IOException e) {
               e.printStackTrace();
           }
       });
    }

    void generateNumbers(){
        //sposób na tworznie liczb w osobnym wątku
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(new Random().nextInt() % 1000 + 1000);
                    int number = new Random().nextInt();
                    notifySubskribers(number);
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
        });
        thread.start();

    }
}
