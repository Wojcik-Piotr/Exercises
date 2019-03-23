package pl.sdacademy.TDD.src.main.java.com.jtest.Palindrom;

import java.util.Stack;

public class Palindrom {

    boolean isPalindrom(String word) {
        if (word == null) {
            throw new PalindromMustNotBeNull("Word is null");
        } else {
            String wordWhitoutspaces = word.replace(" ", "");
            String reversWord = new StringBuilder(wordWhitoutspaces).reverse().toString();
            return reversWord.equals(wordWhitoutspaces);
        }
    }

    boolean isPalindromHemp(String word) {
        if (word == null) {
            return false;
        } else {
            Stack<Character> characters = new Stack<>();
            String wordWhitoutspaces = word.replace(" ", "");
            for (int i = 0; i < wordWhitoutspaces.length(); i++) {
                char charAt = wordWhitoutspaces.charAt(i);
                characters.push(charAt);
            }
            StringBuilder reversetWord = new StringBuilder();
            for (int i = 0; i < wordWhitoutspaces.length(); i++) {
                reversetWord.append(characters.pop());
            }
            return reversetWord.equals(word);
        }
    }


    public static void main(String[] args) {
        Palindrom palindrom=new Palindrom();
        System.out.println(palindrom.isPalindrom(null));
    }
}