package org.example.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void shouldReturnASingleton() {
        Singleton singleton = Singleton.getInstance();
        assertNotNull(singleton);
    }

    @Test
    public void shouldReturnTheSameSingleton() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        assertEquals(s1, s2);
    }
}