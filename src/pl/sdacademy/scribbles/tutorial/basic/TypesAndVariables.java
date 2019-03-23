package pl.sdacademy.scribbles.tutorial.basic;

public class TypesAndVariables {
    public static void main(String[] args) {
        int myVariable; //określamy zmienną
        myVariable=5; // deklarujemy wartość zmiennej
        int myVar2=7; //określamy i deklatujemy zmienną w jednej lini
        double x=2.5;
        String hello="Hello, ";
        String name="Charlie ";
        System.out.println(myVariable); //konsola wyświetla zmienną
        myVariable=10;
        System.out.println(myVariable);
        myVariable=myVariable+1;
        System.out.println(myVariable);
        System.out.println(myVariable+myVar2);
        System.out.println(hello+name);

    }
}
