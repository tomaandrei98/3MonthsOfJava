package org.example.patterns.iterator;

public class HandHeldInventoryIterator<T> implements InventoryIterator<T> {
    private final HandHeldInventory<T> inventory;
    private int index = 0;

    public HandHeldInventoryIterator(HandHeldInventory<T> handHeldInventory) {
        this.inventory = handHeldInventory;
    }

    @Override
    public boolean isDone() {
        return index >= 2;
    }

    @Override
    public T current() {
        return switch (index) {
            case 0 -> inventory.getRight();
            case 1 -> inventory.getLeft();
            default -> null;
        };
    }

    @Override
    public void next() {
        index += 1;
    }

}
