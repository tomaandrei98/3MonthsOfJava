package org.example.patterns.factory.simplefactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaStoreTest {

    @Test
    public void shouldCreateANYStyleCheesePizzaByNYPizzaFactory() {
        NYPizzaFactory concreteNYPizzaFactory = new NYPizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(concreteNYPizzaFactory);

        Pizza actualOutput = pizzaStore.orderPizza("cheese");
        assertTrue(actualOutput instanceof NYStyleCheesePizza);
    }

    @Test
    public void shouldNotCreateANYStyleCheesePizzaByChicagoPizzaFactory() {
        ChicagoPizzaFactory concreteChicagoPizzaFactory = new ChicagoPizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(concreteChicagoPizzaFactory);

        Pizza actualOutput = pizzaStore.orderPizza("cheese");
        assertFalse(actualOutput instanceof NYStyleCheesePizza);
    }

    @Test
    public void shouldCreateAChicagoStyleCheesePizzaByChicagoPizzaFactory() {
        ChicagoPizzaFactory concreteChicagoPizzaFactory = new ChicagoPizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(concreteChicagoPizzaFactory);

        Pizza actualOutput = pizzaStore.orderPizza("cheese");
        assertTrue(actualOutput instanceof ChicagoStyleCheesePizza);
    }

    @Test
    public void shouldNotCreateAChicagoStyleCheesePizzaByNYPizzaFactory() {
        NYPizzaFactory concreteNYPizzaFactory = new NYPizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(concreteNYPizzaFactory);

        Pizza actualOutput = pizzaStore.orderPizza("cheese");
        assertFalse(actualOutput instanceof ChicagoStyleCheesePizza);
    }

}