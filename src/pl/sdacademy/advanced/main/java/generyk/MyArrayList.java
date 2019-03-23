package pl.sdacademy.advanced.main.java.generyk;

import java.util.Arrays;

public class MyArrayList<T> {
    private final int START_CAPACITY = 10;
    private final int CAPACITY_MULTIPLITER = 10;
    private Object[] array = new Object[START_CAPACITY];
    private int size = 0;

    void add(T element) {
        size++;
        ensurCapasity();
        System.arraycopy(array, 0, array, 0, array.length);
        array[size - 1] = element;
    }

    T get(int i) {
        if (i > size || i < 0) {
            throw new RuntimeException("Out of Bound");
        }
        return (T) array[i];
    }

    int find(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        throw new RuntimeException("Element not found");
    }

    void delete(int i) {
        array[i] = null;
        System.arraycopy(array, i + 1, array, i + 1 - 1, size - i + 1);
        size--;
    }

    void delete(T t) {
        delete(find(t));
    }

    int getSize() {
        return size;
    }

    void ensurCapasity() {
        if (size >= array.length) {
            Arrays.copyOf(array, array.length * CAPACITY_MULTIPLITER);
        }
    }


}
