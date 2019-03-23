package pl.sdacademy.beginner.day5.cw2.animal;

public class Cat extends AbstractAnimal{
    public Cat(int legsCount, String name) {
        super(legsCount, name);
    }

    @Override
    public void voice() {
        System.out.println("mial");
    }

    public static void main(String[] args) {
        Cat cat=new Cat(4, "Nora");
        cat.voice();
    }


}
