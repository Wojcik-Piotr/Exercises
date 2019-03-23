package pl.sdacademy.projectPatterns.src.main.java.Iterator;

import java.util.Collections;
import java.util.Iterator;

public class MySkipIterator<T> implements Iterator2<T> {
    Collections collections;
    Iterator<T> collectionIteratoe;

    MySkipIterator(Collections collections){
        this.collections=collections;
    }

    @Override
    public boolean hasNext() {
        collectionIteratoe.next()
        return collectionIteratoe.hasNext();
    }

    @Override
    public T next() {
        return collectionIteratoe.next();
    }
}
