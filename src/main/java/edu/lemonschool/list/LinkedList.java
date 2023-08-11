package edu.lemonschool.list;

import java.util.Arrays;

public class LinkedList<E> implements List<E> {
    //(Composition)
    private final static class Node<E> {
        private E value;
        private Node<E> next;
        private Node<E> previous;

        public Node(E value, Node<E> next, Node<E> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public Node() {
            this.next = null;
            this.previous = null;
            this.value = null;

        }

        public Node(E value) {
            this.value = value;
            this.previous = null;
            this.next = null;
        }
    }

    private int size;
    private Node<E> head;
    private Node<E> tail;



    public LinkedList(int size, Node<E> head, Node<E> tail) {
        this.size = size;
        this.head = head;
        this.tail = tail;
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(E value) {
        addElementToLastPosition(value);
    }

    @Override
    public void add(Integer position, E value) throws IllegalArgumentException {
        if(position < 0 || position > size) {
            throw new IllegalArgumentException("Position must be greater than 0 nad less than size + 1");
        }
        Node<E> newNode = new Node<>(value);
        if(position == 0) {
            addElementToFirstPosition(value);
        } else if(position == size) {
            addElementToLastPosition(value);
        } else {
            addElementToMiddlePosition(position, newNode);
        }
    }

    private void addElementToLastPosition(E value) {
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

    private void addElementToMiddlePosition(int position, Node<E> newNode) {
        Node<E> temp;
        if (position > size / 2) {
            temp = getNodeFromEnd(position);
        } else {
            temp = getNodeFromBegin(position);
        }
        Node<E> next = temp.next;
        newNode.next = next;
        newNode.previous = temp;
        next.previous = newNode;
        temp.next = newNode;
        size++;
    }

    private Node<E> getNodeFromBegin(int position) {
        Node<E> temp;
        temp = head;
        for (int i = 0; i <= position; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private Node<E> getNodeFromEnd(int position) {
        Node<E> temp;
        temp = tail;
        for (int i = size - 1; i >= position; i--) {
            temp = temp.previous; // previous
        }
        return temp;
    }

    private void addElementToFirstPosition(E value) {
        Node<E> newNode = new Node<>(value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public void remove(Integer index) {

    }

    @Override
    public E update(Integer index) {
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
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}
