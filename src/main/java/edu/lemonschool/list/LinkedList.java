package edu.lemonschool.list;

public interface LinkedList<T> {
    void add(T element);
    void add(Integer index, T element);
    void remove(Integer index);
    T update(Integer index);
    T get(Integer index);
    T[] getAll();
}
