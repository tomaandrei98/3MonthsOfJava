package org.example.patterns.iterator;

public interface Inventory<T> {
    InventoryIterator<T> getIterator();
}
