package pl.sdacademy.scribbles.tutorial.basic;

public class Scope {
    static int x;//ponirważ zmienna została zdefiniiaowna poza metodami obowiązuje globalnie
    public static void main(String[] args){
        x=5;
        System.out.println(x);
        doSomething();
        System.out.println(x);
    }
    static void doSomething() {
        x=10;
    }
}
