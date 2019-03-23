package pl.sdacademy.beginner.day4;

public class ZdanieWRamce {
    private static String[] tab = {"Hello", "world", "Some", "text", "in", "array"};

    public static void main(String[] args) {
        ramka(tab);
    }

    private static void ramka(String[] a) {
        int dlugosc = a[0].length();
        for (int i = 1; i < a.length; i++) {
            if (dlugosc < a[i].length()) {
                dlugosc = a[i].length();
            }
        }
        for (int i = 0; i <= a.length + 1; i++) {
            if (i == 0) {
                for (int j = 0; j < dlugosc + 4; j++) {
                    System.out.print('*');
                }
            } else if (i > 0 && i <= a.length) {
                System.out.println();
                System.out.println("* " + a[i - 1] + " *");
            } else if (i == a.length + 1) {
                for (int j = 0; j < dlugosc + 4; j++) {
                    System.out.print('*');
                }
            }
        }
    }
}
