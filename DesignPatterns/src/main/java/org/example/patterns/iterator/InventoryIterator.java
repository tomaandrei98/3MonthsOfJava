package org.example.patterns.iterator;


public interface InventoryIterator<T> {
    boolean isDone();
    void next();
    T current();
}
