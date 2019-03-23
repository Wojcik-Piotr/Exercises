package pl.sdacademy.beginner.day4;

public class SumaTabeliISortowanie {
    private static int[] tab1 = {1, 3, 5, 9, 10};
    private static int[] tab2 = {1, 2, 4, 6, 7, 11};

    public static void main(String[] args) {
        sort(dodaj(tab1, tab2));

    }

    private static int[] dodaj(int[] a, int[] b) {
        int[] tab = new int[a.length + b.length];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            tab[i] = a[i];
            z++;
        }
        for (int i = 0; i < b.length; i++) {
            tab[z + i] = b[i];
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
        return tab;
    }

    private static int[] sort(int[] a) {
        int x = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        return a;
    }
}
