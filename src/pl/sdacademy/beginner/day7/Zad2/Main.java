package pl.sdacademy.beginner.day7.Zad2;

public class Main {
    public static void main(String[] args) {
        Obliczenia obliczenia = new Obliczenia();
        PobieraZnaki pobieraZnaki = new PobieraZnaki(obliczenia);
        Thread thread = new Thread(pobieraZnaki);
        Thread thread1=new Thread(obliczenia);
        thread1.start();
        thread.start();
    }


}
