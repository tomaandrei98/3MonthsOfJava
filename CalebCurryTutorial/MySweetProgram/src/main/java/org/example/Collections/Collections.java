package org.example.Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        Admin a = new Admin();
        a.email = "Caleb@email.com";
        a.ln = "curry";
        ArrayList<Admin> admins = new ArrayList<>();
        admins.add(a);
        List<Person> people = (List<Person>) (List<?>) admins;

        doSomething(people);
    }

    static void doSomething(List<Person> peeps) {
        for (Person p : peeps) {
            System.out.println(p.email + " " + p.ln);
        }
    }
}
