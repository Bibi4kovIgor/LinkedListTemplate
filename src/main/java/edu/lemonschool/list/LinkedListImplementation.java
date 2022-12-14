package edu.lemonschool.list;

import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public class LinkedListImplementation<T> implements LinkedList<T> {

    private Node<T> root;
    private int size = 0;

    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> previous;

        Node(T element) {
            this.element = element;
            next = null;
            previous = null;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void add(T element) {
        Node<T> node;
        if (Objects.isNull(root)) {
            node = new Node<>(element);
            root = node;
        } else  {
            /* TODO: Add your code here */
//            do {
//               node = root;
//
//            } while (Objects.nonNull(node.next));
        }

        size++;
    }

    @Override
    public void add(Integer index, T element) {
        /* TODO: Add your code here */

    }

    @Override
    public void remove(Integer index) {
        /* TODO: Add your code here */

    }

    @Override
    public T update(Integer index) {
        /* TODO: Add your code here */

        return null;
    }

    @Override
    public T get(Integer index) {
        /* TODO: Add your code here */
        return null;
    }

    @Override
    public T[] getAll() {
        /* TODO: Add your code here */

        return null;
    }
}
