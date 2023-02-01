package org.example.patterns.factory.factorymethod;

public class ConcreteCreatorB extends Creator{

    @Override
    Product getProduct() {
        return new ConcreteProductB();
    }
}
