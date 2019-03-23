package pl.sdacademy.beginner.day2;

import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {
        choinka(wysokosc());
    }
    private static int wysokosc(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj wysokość choinki: ");
        int x=scanner.nextInt();
        return x;
    }
    public static void choinka(int a){
        for (int i=0; i<a; i++){
            for(int j=0; j<a*2; j++){
                if(j<(a-i)||j>(i+a)){
                    System.out.print(" ");
                }else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
        for (int i=0; i<2; i++){
            for(int j=0; j<2*a; j++){
                if(j==a){
                    System.out.print('*');
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
