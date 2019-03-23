package pl.sdacademy.beginner.day7.Zad3;

public class Main {
    private static Produkt produkt=new Produkt();
    private static Producent producent=new Producent(produkt);
    private static Klient klient=new Klient(produkt);

    public static void main(String[] args) throws InterruptedException {
        Kupno kupno= new Kupno(producent);
        Sprzedarz sprzedarz=new Sprzedarz(klient);
        Thread buy=new Thread(kupno);
        Thread sell=new Thread(sprzedarz);
    }
}
