package pl.sdacademy.beginner.exceptions;

public class OutOfRangeInList extends RuntimeException {
     private int size;
     private int askedIndex;

    public OutOfRangeInList(int size, int askedIndex) {
        this.size = size;
        this.askedIndex = askedIndex;
    }

    @Override
    public String getMessage() {
        return "You asked for " + askedIndex + "but size is " + size;
    }
}
