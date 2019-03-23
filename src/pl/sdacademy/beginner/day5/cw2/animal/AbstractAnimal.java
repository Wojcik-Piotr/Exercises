package pl.sdacademy.beginner.day5.cw2.animal;

public abstract class AbstractAnimal {
    protected int legsCount;
    protected String name;

    public AbstractAnimal(int legsCount, String name) {
        this.legsCount = legsCount;
        this.name = name;
    }

    public abstract void voice();

}

