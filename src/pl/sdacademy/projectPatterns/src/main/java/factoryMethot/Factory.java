package pl.sdacademy.projectPatterns.src.main.java.factoryMethot;

public class Factory {
    Factory(int value) throws IllegalAccessException {
        creatingShape(value);
    }

    private static String creatingShape(int value) throws IllegalAccessException {
        switch (value) {
            case 1:
                return new Circle().draw();
            case 2:
                return new Squere().draw();
            case 3:
                return new Triangle().draw();
            default:
                throw new IllegalAccessException();
        }
    }

}
