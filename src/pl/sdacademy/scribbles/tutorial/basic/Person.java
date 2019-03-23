package pl.sdacademy.scribbles.tutorial.basic;

public class Person {
    String name;
    int age;

    public Person(String name) {
        this.name=name;
        System.out.println("Person Created");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public void sayHelloTo(Person Person){
        System.out.println(getName()+" said hello to "+Person.getName());
    }
}
