package dataStructures;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
    Node<E> head;
    int size = 0;

    @Override
    public Iterator<E> iterator() {
        // TODO ??
        return null;
    }

    public void add(E value) {
        Node<E> newNode = new Node<E>(value);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<E> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
        size++;
    }

    public void addAll(E[] value) {
        // TODO:
    }

    public E removeLast() {
        // TODO:
        return null;
    }

    public E remove(int index) {
        // TODO:
        return null;
    }

    public E get(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void update(int index, E value) {
        // TODO: 
    }

    public int size() {
        return 0;
    }
}
