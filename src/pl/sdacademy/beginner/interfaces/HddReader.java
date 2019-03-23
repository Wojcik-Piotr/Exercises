package pl.sdacademy.beginner.interfaces;

public class HddReader implements Reader, Printable {
    @Override
    public String read() {
        return "reading HDD";
    }

    @Override
    public void print() {
        System.out.println("I'm hdd reader");
    }

    @Override
    public void printShort() {
        System.out.println("HDD");
    }
}
