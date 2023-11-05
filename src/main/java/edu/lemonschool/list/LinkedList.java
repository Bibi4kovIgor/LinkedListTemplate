package edu.lemonschool.list;

import java.util.Arrays;

public class LinkedList<E> implements List<E> {
    //(Composition)
    private final static class Node<E> {
        E value;
        Node<E> next;
        Node<E> previous;

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

    }

    @Override
    public void add(Integer position, E value) throws IllegalArgumentException {

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
       
    }

    @Override
    public Object[] toArray() {
      
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
      
    }
}
