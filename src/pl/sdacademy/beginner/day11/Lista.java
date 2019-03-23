package pl.sdacademy.beginner.day11;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Piotr");
        list.add("Mateusz");
        list.add("Robert");
        list.add("Łukasz");
        list.add("Michał");
        int index =0;
        for (String name: list){
            System.out.println(index + ". "+ name );
            index+=1;
        }
        System.out.println("Size of list is: "+list.size());

    }
}
