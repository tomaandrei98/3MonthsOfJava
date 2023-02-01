package org.example.patterns.factory.factorymethod;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private static Product concreteProductA;
    private static Product concreteProductB;

    @BeforeAll
    public static void createProducts() {
        concreteProductA = new ConcreteCreatorA().getProduct();
        concreteProductB = new ConcreteCreatorB().getProduct();
    }

    @Test
    public void shouldReturnProductA() {
        assertTrue(concreteProductA instanceof ConcreteProductA);
    }

    @Test
    public void shouldReturnProductB() {
        assertTrue(concreteProductB instanceof ConcreteProductB);
    }

}