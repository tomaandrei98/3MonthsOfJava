package org.example.patterns.factory.factorymethod;

public class ConcreteCreatorA extends Creator {

    @Override
    Product getProduct() {
        return new ConcreteProductA();
    }
}
