package org.example.patterns.factory.abstractfactory;

public abstract class Factory extends ProductA {
    abstract ProductA getProductA();
    abstract ProductB getProductB();
}
