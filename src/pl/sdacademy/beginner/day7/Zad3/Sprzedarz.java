package pl.sdacademy.beginner.day7.Zad3;

public class Sprzedarz implements Runnable {
    private Klient klient;

    public Sprzedarz(Klient klient) {
        this.klient = klient;
    }

    @Override
    public void run() {
        while (true) {
            klient.buyProduct();
        }
    }
}
