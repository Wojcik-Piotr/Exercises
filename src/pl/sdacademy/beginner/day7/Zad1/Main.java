package pl.sdacademy.beginner.day7.Zad1;

public class Main {
    public static void main(String[] args) {
        Petla petla1=new Petla();
        Petla petla2=new Petla();
        Thread thread1=new Thread(petla1);
        Thread thread2=new Thread(petla2);
        thread1.start();
        thread2.start();
    }
}
