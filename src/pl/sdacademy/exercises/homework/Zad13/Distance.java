package pl.sdacademy.exercises.homework.Zad13;

public class Distance {
    private Point point1;
    private Point point2;

    public Distance() {
        setPoint1();
        setPoint2();
        calculate();
    }

    private void setPoint1() {
        System.out.println("Poda współrzędne puntu A: ");
        this.point1 = new Point();
    }

    private void setPoint2() {
        System.out.println("Poda współrzędne puntu B: ");
        this.point2 = new Point();
    }

    private void calculate() {
        int side1 = Math.abs(point1.getX() - point2.getX());
        int side2 = Math.abs(point1.getY() - point2.getY());
        double result = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Odległość między puntami wynosi: " + result);
    }

}
