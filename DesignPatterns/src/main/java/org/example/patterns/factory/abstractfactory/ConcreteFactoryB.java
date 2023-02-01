package org.example.patterns.factory.abstractfactory;

public class ConcreteFactoryB extends Factory {

    @Override
    ProductA getProductA() {
        return new ConcreteProductATwo();
    }

    @Override
    ProductB getProductB() {
        return new ConcreteProductBTwo();
    }
}
