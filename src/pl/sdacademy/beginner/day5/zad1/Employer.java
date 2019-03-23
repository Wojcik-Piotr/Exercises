package pl.sdacademy.beginner.day5.zad1;

public class Employer extends Person implements IEmployer {
    protected String companyName;

    public Employer(String firstName, String lastName, String companyName) {
        super(firstName, lastName);
        this.companyName=companyName;
    }

    @Override
    public String getCompany() {
        return companyName;
    }
   // public String toString{
    //    return "Employer{"+"name='"+firstName+" "+"surname"+lastName+" "+"company name"+companyName+"}";
    //}
}
