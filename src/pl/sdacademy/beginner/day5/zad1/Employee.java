package pl.sdacademy.beginner.day5.zad1;

public class Employee extends Person implements IEmployee {
    protected Employer employer;
    protected double calcSalary;

    protected Employee(String firstName, String lastName, Employer employer, double calcSalary){
        super(firstName, lastName);
        this.employer=employer;
        this.calcSalary=calcSalary;
    }
    @Override
    public Employer getEmployer() {
        return employer;
    }

    @Override
    public double calcSalary() {
        return calcSalary;
    }
}
