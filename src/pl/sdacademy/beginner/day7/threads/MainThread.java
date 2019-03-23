package pl.sdacademy.beginner.day7.threads;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("main: "+Thread.currentThread().getName());
        Thread thread = new MyThread();
        thread.start();
    }
}
