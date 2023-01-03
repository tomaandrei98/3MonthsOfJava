package org.example.Collections;

public class Collections {
    public static void main(String[] args) {
        Item<Person> item = new Item<>();
        item.setX(new Person("email@email.com", "hello"));

        System.out.println(item.getX());
    }
}
