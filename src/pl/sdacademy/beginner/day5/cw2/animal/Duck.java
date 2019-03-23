package pl.sdacademy.beginner.day5.cw2.animal;

public class Duck extends AbstractAnimal{

    public Duck(int legsCount, String name) {
        super(legsCount, name);
    }

    @Override
    public void voice() {
        System.out.println("dak");
    }


    public static void main(String[] args) {
        Duck duck=new Duck(2,"Deisy");
        duck.voice();
    }
}
