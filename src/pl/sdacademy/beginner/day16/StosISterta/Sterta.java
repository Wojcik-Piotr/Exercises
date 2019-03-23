package pl.sdacademy.beginner.day16.StosISterta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sterta {
    public static void main(String[] args) {
        Random random = new Random();
        List<Cos> cosList= new ArrayList<Cos>();
        do {
            cosList.add(new Cos(random.nextInt()));
        }while (true);
    }
}
