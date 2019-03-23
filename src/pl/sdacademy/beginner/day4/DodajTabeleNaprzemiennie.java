package pl.sdacademy.beginner.day4;

public class DodajTabeleNaprzemiennie {
    private static String[] tab1 = {"a", "b", "c"};
    private static String[] tab2 = {"d", "e", "f"};

    public static void main(String[] args) {
        przetasowanie(tab1, tab2);
    }

    private static void przetasowanie(String[] a, String[] b) {
        int z = 0;
        int x = 0;
        String[] c = new String[a.length + b.length];
        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0) {
                c[i] = a[z];
                z++;
            } else {
                c[i] = b[x];
                x++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }
    }
}
