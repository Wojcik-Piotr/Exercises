package pl.sdacademy.beginner.findhighest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindHighestDigit {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("AAAAAa", "DDf", "cdwqqew", "Ade");
        new FindHighestDigit().findHighest();

    }

    public List<String> filterWithStreams(List<String> input) {
        String a = input.stream()
                .map(x -> x.toLowerCase())
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.joining(","));
        System.out.println(a);
        return null;
    }


    public void findHighest(){
        String input = "1489";
        String collect = Arrays.asList(input.split("")).stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        System.out.println(collect);
    }


        public List<String> filterWithFor(List<String> input){
        List<String> output = new ArrayList<>();
        for (String s : input) {
            s=s.toLowerCase();
             if(s.startsWith("a")) {
                 System.out.println(s);
                 output.add(s);
             }
        }
        return output;
    }


    public int findBySort(int input) {
        String stringInput = String.valueOf(input);
        String[] stringArray = stringInput.split("");
        char[] inputchar = stringInput.toCharArray();
        int[] inputInt = new int[stringInput.length()];
        for (int i = 0; i < stringInput.length(); i++) {
            inputInt[i] = Integer.valueOf(stringArray[i]);
        }

        int temp;
        for (int i = 0; i < inputInt.length - 1; i++) {
            if (inputInt[i] < inputInt[i + 1]) {
                temp = inputInt[i];
                inputInt[i] = inputInt[i + 1];
                inputInt[i + 1] = temp;
                break;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i : inputInt) {
            builder.append(i);
        }
        return Integer.parseInt(builder.toString());
    }
}
