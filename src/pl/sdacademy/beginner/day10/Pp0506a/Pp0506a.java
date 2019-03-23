package pl.sdacademy.beginner.day10.Pp0506a;

import java.util.Scanner;

public class Pp0506a {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculate(setTest());
    }

    private static void calculate(int test) {
        for (int i = 0; i < test; i++) {
            Point[] point = bubbleSort(colektPoint(setPointNumber()));
            for (Point point1 : point) {
                System.out.println(point1.getName() + ": x = " + point1.getX() + ", y = " + point1.getY());
            }
        }
    }
    private static Point[] bubbleSort(Point[] point){
        if(point==null||point.length==0){
            return null;
        }
        boolean isSwapprt;
        Point swapper;
        for (int i = 0; i < point.length; i++) {
            isSwapprt=false;
            for (int j = 1; j < point.length - i; j++) {
                if (calculateAbs(point[j - 1].getX(), point[j - 1].getY()) > calculateAbs(point[j].getX(), point[j].getX())) {
                    swapper = point[j - 1];
                    point[j - 1] = point[j];
                    point[j] = swapper;
                    isSwapprt=true;
                }
            }
            if (!isSwapprt){
                break;
            }
        }
        return point;
    }

    private static Point[] colektPoint(int a) {
        Point[] points = new Point[a];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(setName(), setNumber(), setNumber());
        }
        return points;
    }

    private static double calculateAbs(double a, double b) {
        double c = Math.pow(Math.abs(a), 2) + Math.pow(Math.abs(b), 2);
        c = Math.sqrt(c);
        return c;
    }

    private static int setTest() {
        System.out.println("Enter test number: ");
        return scanner.nextInt();
    }

    private static int setPointNumber() {
        System.out.println("Enter point number: ");
        return scanner.nextInt();
    }

    private static String setName() {
        System.out.println("Enter name: ");
        return scanner.next();
    }

    private static double setNumber() {
        System.out.println("Enter number: ");
        return scanner.nextDouble();
    }
}
