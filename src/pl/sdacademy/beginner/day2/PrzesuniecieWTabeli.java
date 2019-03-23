package pl.sdacademy.beginner.day2;

public class PrzesuniecieWTabeli {
    public static void main(String[] args) {
        int liczba= 3;
        int[] lista={1,2,3,4,5,6,7};
       for(int i=0; i<lista.length; i++){
            System.out.println(przesunięcie(liczba, lista));
        }
    }
    public static int[] przesunięcie(int liczba, int[] lista){
        int dlugosc=lista.length;
        int[] tab=new int[dlugosc];
        for (int i=0; i<dlugosc; i++){
            if(i<=dlugosc-liczba-1){
                tab[i+liczba]=lista[i];// mozna zrobic %
            }else{
                tab[i-liczba]=lista[i];
            }
        }
        return tab;
    }
}
