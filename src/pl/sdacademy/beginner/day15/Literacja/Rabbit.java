package pl.sdacademy.beginner.day15.Literacja;

public class Rabbit {
    private int age;

    public int getAge() {
        return age;
    }
    protected void addAge(){
        age++;
    }
    protected boolean isAdult(){
        return age>=4;
    }
}
