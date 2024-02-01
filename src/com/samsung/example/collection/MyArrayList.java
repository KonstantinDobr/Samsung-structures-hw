package com.samsung.example.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class MyArrayList <T> implements Iterable<T> {

    private Object[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public void add(T item) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size] = item;
        size++;
    }

    private void increaseCapacity() {
        int newSize = 2 * array.length;
        array = Arrays.copyOf(array, newSize);
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object item = array[index];
        int numEl = array.length - index - 1;
        System.arraycopy(array, index + 1, array, index, numEl);
        size--;
        return (T) item;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }


    private class MyArrayListIterator implements Iterator<T> {

        private int curIndex = 0;

        @Override
        public boolean hasNext() {
            return curIndex < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            if (hasNext()) {
                T item = (T) array[curIndex];
                curIndex++;
                return item;
            } else {
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported");
        }
    }
}
