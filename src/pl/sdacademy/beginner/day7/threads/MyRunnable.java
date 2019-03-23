package pl.sdacademy.beginner.day7.threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello "+Thread.currentThread().getName());
    }
}
