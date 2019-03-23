package pl.sdacademy.beginner.day2;

public class SumaTabeli {
    public static void main(String[] args) {
        int[] tab1={1,4,8};
        int[] tab2={5,7,14};
        for(int i=0; i<suma(tab1, tab2).length; i++){
            System.out.println(suma(tab1, tab2)[i]);
        }
    }
    public static int[] suma(int[] a, int[]b){
        int[] tab=new int[a.length];
        for(int i=0; i<a.length; i++){
            tab[i]=a[i]+b[i];
        }
        return tab;
    }

}
