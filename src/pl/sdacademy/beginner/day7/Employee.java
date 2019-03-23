package pl.sdacademy.beginner.day7;

public class Employee {
    private int lata;
    private double pensja;
    private String imie;
    private String nazwisko;

    public Employee(String nazwisko, String imie, int lata, double pensja){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.lata=lata;
        this.pensja=pensja;
    }



    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public int getLata() {
        return lata;
    }

    public void setLata(int lata) {
        this.lata = lata;
    }
}
