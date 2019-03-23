package pl.sdacademy.beginner.day14;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        tree(hight());
    }
    private static int hight(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj wysokość choinki: ");
        int hight=scanner.nextInt();
        return hight;
    }
    private static void tree(int hight){
        for (int i=0; i<hight; i++){
            for(int j=0; j<hight*2; j++){
                if(j<(hight-i)||j>(i+hight)){
                    System.out.print(" ");
                }else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
