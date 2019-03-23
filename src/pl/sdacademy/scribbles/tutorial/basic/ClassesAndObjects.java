package pl.sdacademy.scribbles.tutorial.basic;

public class ClassesAndObjects {
    public static void main(String[] angs) {

        Person john=new Person("John");
        john.setAge(20);
        Person bob=new Person("Bob");
        bob.setAge(25);

        john.sayHelloTo(bob);
        bob.sayHelloTo(john);

        System.out.println(john.getName() + " is "+john.getAge()+" yers old.");
        System.out.println(bob.getName() + " is "+bob.getAge()+" yers old.");
    }
}
