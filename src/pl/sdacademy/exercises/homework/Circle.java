package pl.sdacademy.exercises.homework;

public class Circle extends Figures {
    private int radius;

    protected Circle(int radius) {
        if (radius % 2 == 0) {
            System.out.println("The number is even");
        } else {
            this.radius = radius;
        }
    }

    @Override
    protected void printFigures() {
        for (int i = 0; i <= radius * 2; i++) {
            for (int j = 0; j <= radius * 2; j++) {
                int x = (i - radius) * (i - radius);
                int y = (j - radius) * (j - radius);
                if (Math.abs(x + y - radius * radius) < radius || i == radius && j == radius) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
