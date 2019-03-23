package pl.sdacademy.beginner.day7.threads;

public class MainRunnable {
    public static void main(String[] args) {
        MyRunnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
    }
}