package pl.sdacademy.exercises.homework;

import java.util.Scanner;

public class MainProgram {
    private static Scanner scanner = new Scanner(System.in);
    private static int a;
    private static int b;
    private static int c;
    private static Square square = new Square();

    public static void main(String[] args) {
        /*setNumber();
        zeroPoint(getDelta(a, b, c));*/

        //square.printFigures();

        /*requestingNumber();
        Triangle triangle=new Triangle(enterNumber());
        triangle.printFigures();*/

        /*requestingNumber();
        Circle circle=new Circle(enterNumber());
        circle.printFigures();*/
    }

    private static void requestingNumber() {
        System.out.println("Enter the number: ");
    }

    private static int enterNumber() {
        int namber = scanner.nextInt();
        return namber;
    }

    private static void setNumber() {
        requestingNumber();
        System.out.println("a: ");
        a = enterNumber();
        requestingNumber();
        System.out.println("b: ");
        b = enterNumber();
        requestingNumber();
        System.out.println("c: ");
        c = enterNumber();
    }

    private static int getDelta(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        return delta;
    }

    private static void zeroPoint(int delta) {
        if (delta > 0) {
            firstSolution(sqrtDelta(getDelta(a, b, c)), a, b);
        } else if (delta == 0) {
            secondSolution(a, b);
        } else {
            System.out.println("Nie ma rozwiązania!");
        }
    }

    private static double sqrtDelta(int delta) {
        double sqrtDelta = Math.sqrt(delta);
        return sqrtDelta;
    }

    private static void firstSolution(double sqrtDelta, int a, int b) {
        double solution1 = (-b - sqrtDelta) / (2 * a);
        double solution2 = (-b + sqrtDelta) / (2 * a);
        System.out.println("First solution is x= " + solution1);
        System.out.println("Second solution is x= " + solution2);
    }

    private static void secondSolution(int a, int b) {
        double solution = (0 - b) / (2 * a);
        System.out.println("Solution is x= " + solution);
    }
}
