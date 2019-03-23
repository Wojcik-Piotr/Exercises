package pl.sdacademy.beginner.day7.Zad3;

public class Kupno implements Runnable {
    private Producent producent;
    public Kupno(Producent producent){
        this.producent=producent;
    }
    @Override
    public void run() {
        while (true) {
            producent.addProduct();
        }
    }
}
