package pl.sdacademy.exercises.homework.Zad5;

public class Modulo {
    private final int MAX = 100;

    public void divisibleBy3() {
        System.out.println("Liczby podzielne przez 3: ");
        for (int i = 0; i <= MAX; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }

    public void divisibleBy5() {
        System.out.println("Liczby podzielne przez 5: ");
        for (int i = 0; i <= MAX; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }

    public void divisibleBy3And5() {
        System.out.println("Liczby podzielne przez 3 i 5: ");
        for (int i = 0; i <= MAX; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }
}
