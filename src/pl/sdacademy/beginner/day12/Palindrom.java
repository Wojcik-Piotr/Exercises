package pl.sdacademy.beginner.day12;

public class Palindrom {
    private static char[] tab = {'k', 'o', 'b', 'y', 'ł', 'a', ' ', 'm', 'a', ' ', 'm', 'a', 'ł', 'y', ' ', 'b', 'o', 'k'};

    public static void main(String[] args) {
        System.out.println(istPalindrom(tab));
    }

    private static boolean istPalindrom(char[] word) {
        int head = 0;
        int back = word.length - 1;
        while (back > head) {
            if (word[head] != word[back]) {
                if (word[head] == ' ') {
                    head++;
                } else if (word[back] == ' ') {
                    back--;
                } else {
                    return false;
                }
            }
            head++;
            back--;
        }
        return true;
    }
}
