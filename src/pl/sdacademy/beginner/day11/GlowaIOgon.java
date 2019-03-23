package pl.sdacademy.beginner.day11;

import java.util.ArrayDeque;
import java.util.Random;

public class GlowaIOgon {
    private static Random random=new Random();
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers=new ArrayDeque<>();
        for(int i=0; i<10; i++){
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        while (!numbers.isEmpty()) {
            if (numbers.peek()%2==0){
                System.out.println(numbers.pollFirst());
            }else {
                numbers.pollFirst();
            }

        }

    }
}
