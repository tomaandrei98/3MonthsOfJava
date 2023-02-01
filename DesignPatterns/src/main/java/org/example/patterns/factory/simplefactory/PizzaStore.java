package org.example.patterns.factory.simplefactory;

public class PizzaStore {
    AbstractPizzaFactory factory;

    public PizzaStore(AbstractPizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }



}
