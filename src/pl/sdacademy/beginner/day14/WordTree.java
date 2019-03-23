package pl.sdacademy.beginner.day14;

import java.util.Scanner;

public class WordTree {
    public static void main(String[] args) {
        tree(hight());
    }

    private static String hight(){
        Scanner scanner=new Scanner(System.in);
        String hight;
        do {
            System.out.println("Podaj słowo o nieparzystej liczbie znaków: ");
            hight = scanner.next();
            if (hight.length()%2==0){
                System.out.println("Błędna ilość znaków!");
            }
        }while (hight.length()%2==0);
        return hight;
    }

    private static void tree(String hight){
        for (int i=0; i<(hight.length()/2)+1; i++){
            for(int j=0; j<hight.length(); j++){
                if(j<(hight.length()/2-i)||j>(i+hight.length()/2)){
                    System.out.print(".");
                }else {
                    System.out.print(hight.charAt(j));
                }
            }
            System.out.println();
        }
    }

}
