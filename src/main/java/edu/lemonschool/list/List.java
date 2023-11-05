package edu.lemonschool.list;

public interface List<E> {
    void add(E element);
    void add(Integer index, E element);
    void remove(Integer index);
    E update(Integer index);
    E get(Integer index);
    Object[] toArray();
}
