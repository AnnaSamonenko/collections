package my_list;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private Object[] data;

    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public Iterator iterator() {
        return null;
    }

    public E[] toArray() {
        return null;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean add(Object o) {
        if (size == data.length)
            ensureCapacity();
        data[size++] = o;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        rangeCheck(index);
        return (E) data[index];
    }

    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        rangeCheck(index);
        E oldValue = (E) data[index];
        data[index] = element;
        return oldValue;
    }

    public void add(int index, Object element) {
    }

    public E remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    private void rangeCheck(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException("There no element with index: " + index);
    }

    private void ensureCapacity() {
        size *= 2;
        data = Arrays.copyOf(data, size);
    }
}