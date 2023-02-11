package org.example.patterns.iterator;

public class Client {
    public static void main(String[] args) {
        Inventory<Integer> i = new HandHeldInventory<>(8, 4);
        InventoryIterator<Integer> iterator = i.getIterator();
        while (!iterator.isDone()) {
            Integer current = iterator.current();
            System.out.println(current);
            iterator.next();
        }
    }

}
