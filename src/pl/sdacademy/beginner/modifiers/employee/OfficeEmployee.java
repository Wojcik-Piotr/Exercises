package pl.sdacademy.beginner.modifiers.employee;

public class OfficeEmployee extends Employee {

    public Double getGrossSalary(){
             return getSalary() * 1.23;
    }

}
