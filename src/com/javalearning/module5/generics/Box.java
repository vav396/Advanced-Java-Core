package com.javalearning.module5.generics;

public class Box<T> {
    private T content;

    public void put(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public boolean isEmpty() {
        return content == null;
    }
}
