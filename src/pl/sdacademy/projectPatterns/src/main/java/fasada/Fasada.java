package pl.sdacademy.projectPatterns.src.main.java.fasada;

import java.util.HashMap;
import java.util.Map;

public class Fasada {
    private static HashMap<Integer, String> hashMap=new HashMap<Integer, String>();

    private static void printHashMap(HashMap<Integer, String>hashMap){
        for (int i = 0; i <10 ; i++) {
            hashMap.put(i, "Cos"+i);
        }
        for (Map.Entry<Integer,String> entry: hashMap.entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        printHashMap(hashMap);
    }
}
