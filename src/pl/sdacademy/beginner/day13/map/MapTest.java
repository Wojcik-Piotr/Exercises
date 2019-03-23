package pl.sdacademy.beginner.day13.map;

import java.util.HashMap;

public class MapTest {
    private static HashMap<Double, Double> map=new HashMap<>();

    public static void main(String[] args) {
        fillMap();
        printMap();
    }
    private static void fillMap(){
        for (double i=-10d; i<=10d;i+=0.5d){
            map.put(i, i*i);
        }
    }
    private static void printMap(){
        for (HashMap.Entry<Double, Double> entry: map.entrySet()){
            double key= entry.getKey();
            double value= entry.getValue();
            System.out.println(String.format("%6.2f %6.2f",key,value));
        }
    }
}
