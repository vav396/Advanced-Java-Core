package com.javalearning.module5.generics;

public class Box <T> {
    private T content;

    public void put(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
    public boolean isEmpty() {
        if (content == null) {
            return true;
        } else {
            return false;
        }
    }
}
