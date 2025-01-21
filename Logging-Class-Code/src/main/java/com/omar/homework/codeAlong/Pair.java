package com.omar.homework.codeAlong;

public class Pair<T,U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.second = second;
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
