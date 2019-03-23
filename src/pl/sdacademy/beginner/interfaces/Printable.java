package pl.sdacademy.beginner.interfaces;

public interface Printable {
    String some ="";
    void print();
    void printShort();
    default void some(){
        System.out.println("");
    }

}
