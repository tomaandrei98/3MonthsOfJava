package org.example.patterns.factory.abstractfactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    private static ConcreteFactoryA concreteFactoryA;
    private static ConcreteFactoryB concreteFactoryB;
    private static ConcreteFactoryC concreteFactoryC;

    @BeforeAll
    public static void setup() {
        concreteFactoryA = new ConcreteFactoryA();
        concreteFactoryB = new ConcreteFactoryB();
        concreteFactoryC = new ConcreteFactoryC();
    }

    @Test
    public void concreteFactoryAShouldCreateConcreteProductAOne() {
        ProductA actualOutput = concreteFactoryA.getProductA();
        assertTrue(actualOutput instanceof ConcreteProductAOne);
    }

    @Test
    public void concreteFactoryAShouldCreateConcreteProductBOne() {
        ProductB actualOutput = concreteFactoryA.getProductB();
        assertTrue(actualOutput instanceof ConcreteProductBOne);
    }

    @Test
    public void concreteFactoryBShouldCreateConcreteProductATwo() {
        ProductA actualOutput = concreteFactoryB.getProductA();
        assertTrue(actualOutput instanceof ConcreteProductATwo);
    }

    @Test
    public void concreteFactoryBShouldCreateConcreteProductBTwo() {
        ProductB actualOutput = concreteFactoryB.getProductB();
        assertTrue(actualOutput instanceof ConcreteProductBTwo);
    }

    @Test
    public void concreteFactoryCShouldCreateConcreteProductAThree() {
        ProductA actualOutput = concreteFactoryC.getProductA();
        assertTrue(actualOutput instanceof ConcreteProductAThree);
    }

    @Test
    public void concreteFactoryCShouldCreateConcreteProductBThree() {
        ProductB actualOutput = concreteFactoryC.getProductB();
        assertTrue(actualOutput instanceof ConcreteProductBThree);
    }

}