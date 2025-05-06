package com.javaremotero79.part4_generic;

public class Box<T> {
    private T value;
    private String labal;
    private static int count;

    public T getValue() {
        return value;
    }

    public Box(T value, String labal) {
        this.value = value;
        this.labal = labal;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                ", labal='" + labal + '\'' +
                '}';
    }
}
