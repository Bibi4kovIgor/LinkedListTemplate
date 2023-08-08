package edu.lemonschool.list;

import java.util.Arrays;

public class LinkedList<E> implements List<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> previous;

        Node(E element) {
            this.element = element;
            next = null;
            previous = null;
        }
    }

    private int size;
    private Node<E> head;
    private Node<E> tail;    

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        if (this.size == 0) {
            this.head = this.tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        this.size++;
    }

    @Override
    public void add(Integer index, E element) {
        /* TODO: Add your code here */

    }

    @Override
    public void remove(Integer index) {
        /* TODO: Add your code here */

    }

    @Override
    public E update(Integer index) {
        /* TODO: Add your code here */

        return null;
    }

    @Override
    public E get(Integer index) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E[] toArray() {
        Object[] result = new Object[size];
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            result[i] = temp.value;
            temp = temp.next;
        }
        return (E[])result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

}
