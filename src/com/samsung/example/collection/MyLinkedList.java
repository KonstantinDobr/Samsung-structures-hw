package com.samsung.example.collection;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyLinkedList<T> implements Iterable<T> {
    private class Node {

        private T data;
        private Node next;
        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }


    }
    private Node first;

    private Node last;
    public MyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T item) {
        if (!isEmpty()) {
            Node prev = last;
            last = new Node(item, null);
            prev.next = last;
        } else {
            Node node = new Node(item, null);
            last = node;
            first = node;
        }
    }

    public void addFirst(T item) {
        if (!isEmpty()) {
            Node next = first;
            first = new Node(item, null);
            first.next = next;
        } else {
            Node node = new Node(item, null);
            last = node;
            first = node;
        }
    }

    public boolean remove(T item) {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove. List is empty!");
        }
        boolean result = false;
        Node prev = null;
        Node curr = first;

        while (curr.next != null && curr.data.equals(item)) {
            prev = curr;
            curr = prev.next;
        }
        if (curr.data.equals(item)) {
            if (first == last) {
                first = null;
            } else if (curr == first) {
                first = first.next;
            } else if (curr == last) {
                last = prev;
                last.next = null;
            } else {
                prev.next = curr.next;
            }
            result = true;
        }

        return true;

    }

    @Override
    public Iterator<T> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<T> {

        private Node cursor = first;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            T item = cursor.data;
            cursor = cursor.next;
            return item;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            Iterator.super.forEachRemaining(action);
        }
    }

}
