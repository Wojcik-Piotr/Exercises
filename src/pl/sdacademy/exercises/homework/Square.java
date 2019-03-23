package pl.sdacademy.exercises.homework;

public class Square extends Figures {
    private int size=5;

    @Override
    protected void printFigures() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

