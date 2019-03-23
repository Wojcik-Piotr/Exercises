package pl.sdacademy.beginner.day7.Zad3;

public class Producent {
    private int ilosc;
    private Produkt produkt;

    public Producent(Produkt produkt){
        this.produkt=produkt;
    }
    protected void addProduct(){
        produkt.setIlosc(produkt.getIlosc()+100);
    }
}
