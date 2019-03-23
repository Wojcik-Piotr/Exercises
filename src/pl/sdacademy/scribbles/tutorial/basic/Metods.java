package pl.sdacademy.scribbles.tutorial.basic;

public class Metods {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloTo("Charlie");
        sayHelloTo("John");
        int x=returnFive();
        System.out.println(x);
        int result=square(x);
        System.out.println(result);
    }
    static int square(int x) {
        return x*x;
    }
    //zwraca wartość int
    static int returnFive() {
        return 5;
    }
    //wyświetla "Hello, World"
    static void sayHelloWorld() {
        System.out.println("Hello, World");
    }
    //wyświetla "Hello, " i wprowadzone imie
    static void sayHelloTo(String name) {
        System.out.println("Hello, "+name);
    }
}
