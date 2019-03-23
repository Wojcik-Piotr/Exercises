package pl.sdacademy.TDD.src.main.java.com.jtest.calculator;

public class User {
    private String name;
    private int age;

    public User(String name, int age){
        this.name=name;
        this.age=age;
    }
    static public User of(String name, int age){
        User janusz= new User(name,age);
        return janusz;
    }
}
