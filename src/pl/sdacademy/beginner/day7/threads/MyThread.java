package pl.sdacademy.beginner.day7.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
