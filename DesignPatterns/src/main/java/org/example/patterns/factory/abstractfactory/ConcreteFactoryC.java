package org.example.patterns.factory.abstractfactory;

public class ConcreteFactoryC extends Factory {

    @Override
    ProductA getProductA() {
        return new ConcreteProductAThree();
    }

    @Override
    ProductB getProductB() {
        return new ConcreteProductBThree();
    }
}
