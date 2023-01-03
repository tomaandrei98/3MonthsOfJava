package org.example.Collections;

import java.util.Objects;

public class Person {
    public String email;
    public String ln;
    public Position position;

    public Person(String email, String ln) {
        this.email = email;
        this.ln = ln;
    }

    public Person() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email) && Objects.equals(ln, person.ln) && Objects.equals(position, person.position);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((ln == null) ? 0 : ln.hashCode());
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        return result;
    }
}
