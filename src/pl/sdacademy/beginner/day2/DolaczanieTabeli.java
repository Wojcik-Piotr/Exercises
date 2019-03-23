package pl.sdacademy.beginner.day2;

public class DolaczanieTabeli {
    public static void main(String[] args) {
        String[] tab1={"a","b","c","d"};
        String[] tab2={"e","f","g"};
        int dlugosc=tab2.length+tab1.length;
        for (int x=0; x<dlugosc; x++){
            System.out.println(koniunkcja(tab1, tab2));
        }

    }
    public static String[] koniunkcja(String[] a, String[] b){
        int dlugosc=a.length+b.length;
        int v=0;
        String[] tablica=new String[dlugosc];
        for (int i=0; i<a.length; i++){
            tablica[i]=a[i];
            v=i+1;
        }
        int l=0;
        for(int j=v; j<dlugosc; j++){
            tablica[j]=b[l];
            l++;
        }
        return tablica;
    }

}
