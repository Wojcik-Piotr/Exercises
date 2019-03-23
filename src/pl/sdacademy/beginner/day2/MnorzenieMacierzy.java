package pl.sdacademy.beginner.day2;

public class MnorzenieMacierzy {
    public static void main(String[] args) {
        double[][] tab1={{2,6,5},{8,4,6}};
        double[][] tab2={{5,9},{5,3},{4,9}};
        double[][] tab3=mnozenie(tab1,tab2);
        for (int i=0; i<tab3.length; i++){
            for (int j=0; j<tab3[i].length; j++){
                System.out.print(tab3[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static double[][] mnozenie(double[][] a, double[][] b){
        int wiersze=0;
        int kolumny=0;
        if (a.length<b.length){
            wiersze=a.length;
        }else {
            wiersze=b.length;
        }
        if (a[0].length<b[0].length){
            kolumny=a[0].length;
        }else {
            kolumny=b[0].length;
        }
        double[][] tab=new double[wiersze][kolumny];
        for (int i=0; i<wiersze; i++){
            for (int j=0; j<wiersze; j++){
                for (int l=0; l<kolumny; l++){
                    tab[i][j]+=b[i][l]*a[l][j];
                }
            }
        }
        return tab;
    }
}
