package pl.sdacademy.shop.src.main.java.colekcie;

public class MyLinkedList<T> {

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T t) {
        Node node = new Node(t);
        if (isEmpty()) {
            first = node;
            last = first;
        } else {
            last.next = node;
            node.prievius = last;
            last = node;
        }
    }

    public int getSize() {
        int size = 0;
        Node current = first;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public T get(T t) {
        Node current = first;
        while (current != null) {
            if (t.equals(current.valiue)) {
                return current.valiue;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    class Node {
        T valiue;
        Node next;
        Node prievius;

        Node(T t) {
            this.valiue = t;
        }
    }

}
