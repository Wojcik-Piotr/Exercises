package pl.sdacademy.beginner.day2;

public class ZnajdzNajmniejsza {
    public static void main(String[] args) {
        int[] lista={4,5,6,9,5,3,1,9};
        System.out.println(min(lista));
    }
    public static int min(int[] a){
        int najmniejsza=a[0];
        for (int i=1; i<a.length; i++) {
            if (a[i]<najmniejsza){
                najmniejsza=a[i];
            }
        }
        return najmniejsza;
    }
}
