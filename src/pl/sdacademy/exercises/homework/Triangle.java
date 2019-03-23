package pl.sdacademy.exercises.homework;

public class Triangle extends Figures {
    private int arm;

    protected Triangle(int arm) {
        this.arm = arm;
    }

    @Override
    protected void printFigures() {
        for (int i = 0; i < arm; i++) {
            for (int j = 0; j < arm; j++) {
                if (j <= i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
