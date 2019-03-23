package pl.sdacademy.beginner;

public class Main {

    public static void main(String[] args) {
        char[] fretreterw = {'A', 'D', 'A'};
        int offset = 3;

        for (int i = 0; i < fretreterw.length; i++) {
            char toDisplay = (char) (fretreterw[i]+offset);
            System.out.println(toDisplay);

        }
    }
}
