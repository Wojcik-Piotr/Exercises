package pl.sdacademy.beginner.day1;

public class TabelaString2 {
    public static void main(String[] args) {
        String[] tablica=new String[5];
        tablica[0]="cos";
        tablica[1]="tko";
        tablica[2]="fdd";
        tablica[3]="kka";
        tablica[4]="sda";
        System.out.println(tablica.length); //sprawdza rozmiar tablicy

        for(int i=0; i<5; i++){
            System.out.println(tablica[i]);
        }
    }
}
