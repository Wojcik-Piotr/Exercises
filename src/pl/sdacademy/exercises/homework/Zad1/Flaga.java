package pl.sdacademy.exercises.homework.Zad1;

public class Flaga {
    private final int FERST_LAYER_STARS = 6;
    private final int SECOND_LEYER_STARS = 5;
    private final int SZEROKOSC = 46;
    private final int HEIGHT = 15;

    private void leyer1() {
        for (int i = 0; i < FERST_LAYER_STARS; i++) {
            System.out.print("* ");
        }
        for (int i = 0; i < SZEROKOSC - FERST_LAYER_STARS * 2; i++) {
            System.out.print("=");
        }
        System.out.print("\n");
    }

    private void layer2() {
        for (int i = 0; i < SECOND_LEYER_STARS; i++) {
            System.out.print(" *");
        }
        System.out.print("  ");
        for (int i = 0; i < SZEROKOSC - 2 - SECOND_LEYER_STARS * 2; i++) {
            System.out.print("=");
        }
        System.out.print("\n");
    }

    private void bootomLayer() {
        for (int i = 0; i < SZEROKOSC; i++) {
            System.out.print("=");
        }
        System.out.print("\n");
    }

    protected void drawFlag() {
        for (int i = 0; i < HEIGHT; i++) {
            if (i % 2 == 1 && i < 10) {
                leyer1();
            } else if (i % 2 == 0 && i < 10) {
                layer2();
            } else {
                bootomLayer();
            }
        }
    }
}
