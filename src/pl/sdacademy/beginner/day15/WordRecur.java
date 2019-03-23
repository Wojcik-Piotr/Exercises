package pl.sdacademy.beginner.day15;

import java.util.Scanner;

public class WordRecur {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String word = "slowo";
        String word2 = "((()))";
        System.out.println(wordStar(word, word.length()));
        System.out.println(areBrices(word2, word2.length()));
    }

    private static String setWord() {
        System.out.println("Podaj słowo: ");
        return scanner.next();
    }

    private static String wordStar(String word, int counter) {
        if (counter == 1) {
            return word.substring(word.length() - counter);
        }
        return word.charAt(word.length() - counter) + "*" + wordStar(word, --counter);
    }

    private static boolean areBrices(String word, int counter) {
        if (word.length() % 2 == 0) {
            if (counter == (word.length() / 2)+1) {
                return word.charAt(counter - 1)==')' && word.charAt(word.length() - counter) =='(';
            } else {
                return word.charAt(counter - 1)==')' && word.charAt(word.length() - counter) =='(' && areBrices(word, --counter);
            }
        } else {
            return false;
        }
    }
}