package pl.sdacademy.beginner.day14;

import java.util.Scanner;

public class Stairs {
    private static Scanner scanner=new Scanner(System.in);

    private static int getNumber(){
        System.out.println("Podaj ilość stopni: ");
        int step=scanner.nextInt();
        return step;
    }

    private static void setStairs(int step){
        for (int i=0;i<step;i++){
            for (int j=0;j<step;j++){
                if (i>=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        setStairs(getNumber());
    }
}
