package pl.sdacademy.beginner.diamonds;

@SuppressWarnings("unchecked")
public class SecondList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] items = new Object[DEFAULT_CAPACITY];
    private int index = 0;

    public void add(T e) {
        ensureCapacity();
        items[index] = e;
        index++;
    }

    public int size() {
        return index;
    }

    public T getByPosition(int pos) {
        if (pos > index || pos < 0) throw new IndexOutOfBoundsException();
        return (T)items[pos];
    }

    public int indexOf(T o) {
        for (int i = 0; i < items.length; i++)
            if (items[i] == o) return i;
        throw new RuntimeException();

    }

    private void ensureCapacity() {
        if (index < items.length) return;
        Object[] temp = new Object[items.length * 2];
        System.arraycopy(items, 0, temp, 0, index);
        items = temp;
    }

}
