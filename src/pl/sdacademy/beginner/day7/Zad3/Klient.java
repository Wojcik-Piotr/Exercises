package pl.sdacademy.beginner.day7.Zad3;

public class Klient {
    private Produkt produkt;

    public Klient(Produkt produkt) {
        this.produkt = produkt;
    }

    protected void buyProduct() {
        if (produkt.getIlosc() > 0) {
            produkt.setIlosc(produkt.getIlosc() - 10);
        }
    }

}
