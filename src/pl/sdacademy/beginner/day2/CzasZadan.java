package pl.sdacademy.beginner.day2;

public class CzasZadan {
    public static void main(String[] args) {
        int[]zad={1,5,1,3,3,4,5};
        int czas=11;
        System.out.println("Zrobisz "+wykon(czas, zad)+" zadań");

    }
    public static int wykon(int a, int[] b){
        int c=0;
        while (a>=0){
            a=a-b[c];
            c++;
        }
        return c;
    }
}
