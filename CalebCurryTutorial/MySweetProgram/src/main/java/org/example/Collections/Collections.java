package org.example.Collections;

import java.util.HashMap;
import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {


        Person p = new Person("email@email.com", "Curry");
        Position pos1 = new Position(10, 10);
        p.position = pos1;

        Person q = new Person("email@email.com", "Curry");
        Position pos2 = new Position(10, 10);
        q.position = pos2;

        System.out.println(p.equals(q));
        System.out.println(p.hashCode());
        System.out.println(q.hashCode());

        //unordered (hashCode is used to determine where to insert these elements) and no duplicates
        HashSet<Person> people = new HashSet<>();
        people.add(p);
        people.add(q);
        System.out.println(people);

        Person newPerson = new Person("email@email.com", "Curry");
        Position newPosition = new Position(10, 10);
        newPerson.position = newPosition;
        System.out.println(people.contains(newPerson));

        HashMap<String, Person> peeps = new HashMap<>();
        peeps.put("email@email.com", newPerson);
        System.out.println(peeps.containsKey("email@email.com"));

    }
}
