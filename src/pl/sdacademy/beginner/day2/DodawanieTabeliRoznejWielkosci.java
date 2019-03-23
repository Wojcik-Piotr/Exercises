package pl.sdacademy.beginner.day2;

public class DodawanieTabeliRoznejWielkosci {
    public static void main(String[] args) {
        int[] tab1={1,4,8,3,10};
        int[] tab2={5,7,14};

        for(int i=0; i<suma(tab1, tab2).length; i++){
            System.out.println(suma(tab1, tab2)[i]);
        }
    }
    public static int[] suma(int[] a, int[]b){
        int dlugosc=0;
        if (a.length>b.length){
            dlugosc=a.length;
        }else {
            dlugosc=b.length;
        }
        int[] tab=new int[dlugosc];
        for(int i=0; i<a.length; i++){
            tab[i]=a[i];
        }
        for (int j=0; j<b.length; j++){
            tab[j]=tab[j]+b[j];
        }
        return tab;
    }
}
