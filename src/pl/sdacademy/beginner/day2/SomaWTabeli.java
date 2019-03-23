package pl.sdacademy.beginner.day2;

public class SomaWTabeli {
    public static void main(String[] args) {
        int[][] tab1={{2,3},{6,7},{8,2},{5,6}};
        System.out.println("Index największej sumy to: "+index(tab1));
    }
    public static int index(int[][] a){
        int x=0;
        int[] tab=new int[a.length];
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                tab[i]=tab[i]+a[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
        for (int i=1; i<tab.length; i++){
            if(tab[i-1]>tab[i]){
                x=i-1;
            }
        }
        return x;
    }
}
