package pl.sdacademy.beginner.day5.zad2;

import java.awt.*;

public class SomethingIsWrong {
    private Rectangle myRect;



    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width=40;
        myRect.height=50;
        System.out.println("myRect's area is "+area(myRect.height,myRect.width));


    }
    public static int area(int a, int b){
        int c=a*b;
        return c;

    }
}
