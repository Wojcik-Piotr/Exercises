package pl.sdacademy.beginner.hashcode;

public class Person {

    private String pesel;
    private String name;
    private int age;

    public Person(String pesel, String name, int age) {
        this.pesel = pesel;
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o){
        if(o == this) return  true;
        if(o instanceof Person) {
            Person p = (Person) o;
            boolean nameEquals = this.name.equals(p.name);
            boolean peselEquals = this.pesel.equals(p.pesel);
            boolean ageEquals = this.age == p.age;
            return  nameEquals && peselEquals && ageEquals;
        }
            else return false;
    }
    public int hashCode(){
        int hashCode = name.hashCode();
        hashCode = hashCode + 32 * pesel.hashCode();
        hashCode = hashCode + age;
        return hashCode;
    }
}
