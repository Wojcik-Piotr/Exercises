package pl.sdacademy.TDD.src.main.java.com.jtest.calculator;

class Calculator {

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    int add(int a, int b) {
        return a + b;
    }
    double divide(double a, double b){
        return a/b;
    }
}
