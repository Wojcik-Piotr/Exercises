package pl.sdacademy.beginner.day14.Boxs;

public class GenericBox<T> {
    private T t;

    protected void set(T t) {
        this.t = t;
    }

    protected T get() {
        return t;
    }
}
