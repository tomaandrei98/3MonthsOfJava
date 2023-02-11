package org.example.patterns.iterator;


public class HandHeldInventory<T> implements Inventory<T> {
    public T right;
    public T left;

    public HandHeldInventory(T right, T left) {
        this.right = right;
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public T getLeft() {
        return left;
    }

    @Override
    public InventoryIterator<T> getIterator() {
        return new HandHeldInventoryIterator<>(this);
    }
}
