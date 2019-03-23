package pl.sdacademy.beginner.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList {

    private Entry entry;
    private int size = 0;

    public String toSingleString(List<String> all) {
        StringBuffer builder = new StringBuffer();
        for (String s : all)
            builder.append(s);
        return builder.toString();
    }


    public void remove(Object e) {
        if (entry == null) return;
        new ArrayList<>().size();
        Entry beforeRemoved = null;
        Entry toRemove = entry;
        Entry afterRemoved = null;

        while (toRemove.val != e) {
            beforeRemoved = toRemove;
            toRemove = afterRemoved;
            afterRemoved = afterRemoved.next;
        }

        toRemove.next = null;
        beforeRemoved.next = afterRemoved;
        size--;
    }

    public void add(Object e) {
        // Gdy lista jest pusta
        Entry elementToAdd = new Entry(e);

        if (entry == null) {
            entry = elementToAdd;
            return;
        }

        ///Gdy w liscie cos jest
        Entry lastValue = getLastElement();
        lastValue.next = elementToAdd;
        size++;
        ///
    }

    public int getSize() {
        return size;
    }

    private Entry getLastElement() {
        Entry current = entry.next;
        Entry lastValue = entry;

        //W tej petli chcemy aby lastValue byl ostatnim elementem
        while (current != null) {
            lastValue = current;
            current = current.next;
        }

        return lastValue;
    }

    interface TestInterface {
        default void some() {
            System.out.println("");
        }
    }

    interface TestInterface2 {
        default void some() {
            System.out.println("");
        }
    }

    abstract class TestAbstract {
        void some() {
            System.out.println("");
        }
    }

    class Entry {
        Object val;
        Entry next;

        Entry(Object val) {
            this.val = val;

        }
    }
}
