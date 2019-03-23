package pl.sdacademy.beginner.diamonds;

import com.sda.exceptions.OutOfRangeInList;

@SuppressWarnings("unchecked")
public class MyArrayList<T> {

    private static final int INITIAL_CAPACITY = 10;

    private Object[] data = new Object[INITIAL_CAPACITY];

    private int currentIndex = 0;

    public T get(int i) {
        if (i > currentIndex)
            throw new OutOfRangeInList(size(), i);
        return (T) data[i];
    }


    public void add(T t) {
        ensureCapacity();
        data[currentIndex++] = t;
    }

    public boolean contains(T t) {
        for (Object aData : data) if (aData == t) return true;
        return false;
    }

    public boolean isEmpty() {
        return currentIndex == 0;

    }

    public int lastIndexOf(T t) {
        for (int i = currentIndex; i <=0; i--) if (data[i] == t) return i;
        return -1;

    }

    public int size() {
        return currentIndex;
    }

    private void ensureCapacity() {
        Object[] newData = new Object[data.length + 100];
        System.arraycopy(data, 0, newData, 0, data.length);
//        for (int i = 0; i < currentIndex; i++)
//            newData[i] = data[i];
        data = newData;
    }
}
