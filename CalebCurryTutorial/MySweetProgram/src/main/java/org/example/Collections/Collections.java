package org.example.Collections;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        Pair<Person, Person> pair = new Pair<>();
        pair.setX(new Person("email@email.com", "hello"));
        pair.setY(new Person("email@email.com", "hello"));

        System.out.println(pair.getX());
        System.out.println(pair.getY());

        Pair<Integer, String> pair2 = new Pair<>();
        pair2.setX(7);
        pair2.setY("fav no");
        System.out.println(pair2.getX());
        System.out.println(pair2.getY());

        Pair<Integer, String> pair3 = new Pair<>();
        pair2.setX(10);
        pair2.setY("subs no");

        ArrayList<Pair<Integer, String>> pears = new ArrayList<>();
        pears.add(pair2);
        pears.add(pair3);
        System.out.println(pears);

        ArrayList<Person> people = new ArrayList<>();
        Admin a = new Admin();
        people.add(a);
        doSomething(a);
    }

    static void doSomething(Person person) {
        System.out.println(person);
    }
}
