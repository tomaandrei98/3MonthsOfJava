package org.example.patterns.factory.simplefactory;

public class NYPizzaFactory extends AbstractPizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
