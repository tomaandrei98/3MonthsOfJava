package org.example.patterns.factory.simplefactory;

public class ChicagoPizzaFactory extends AbstractPizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
