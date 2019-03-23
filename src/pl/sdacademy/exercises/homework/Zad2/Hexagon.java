package pl.sdacademy.exercises.homework.Zad2;

public class Hexagon {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double field() {
        return ((3 * Math.pow(side, 2) * Math.sqrt(3)) / 2);
    }

    public double circuit() {
        return (6 * side);
    }

    public double diagonalLong() {
        return (2 * side);
    }

    public double diagonalShort() {
        return (side * Math.sqrt(3));
    }

    public double radiusOfCircle() {
        return ((side * Math.sqrt(3)) / 2);
    }
}
