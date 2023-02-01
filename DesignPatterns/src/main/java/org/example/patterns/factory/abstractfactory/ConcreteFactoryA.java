package org.example.patterns.factory.abstractfactory;

public class ConcreteFactoryA extends Factory {

    @Override
    ProductA getProductA() {
        return new ConcreteProductAOne();
    }

    @Override
    ProductB getProductB() {
        return new ConcreteProductBOne();
    }
}
