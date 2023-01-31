package org.example.patterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {

    @Test
    public void espressoShouldReturnOne() {
        Espresso espresso = new Espresso();
        int actualOutput = espresso.cost();
        int expectedOutput = 1;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void latteShouldReturnTwo() {
        Latte latte = new Latte();
        int actualOutput = latte.cost();
        int expectedOutput = 2;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void espressoWithCaramelShouldReturnFour() {
        Beverage espresso = new Espresso();
        Beverage espressoWithCaramel = new CaramelAddOnDecorator(espresso);
        int actualOutput = espressoWithCaramel.cost();
        int expectedOutput = 4;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void espressoWithCreamShouldReturnFour() {
        Beverage espresso = new Espresso();
        Beverage espressoWithCream = new CreamAddOnDecorator(espresso);
        int actualOutput = espressoWithCream.cost();
        int expectedOutput = 4;

        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void espressoWithCreamAndCaramelShouldReturnEight() {
        Beverage espresso = new Latte();
        Beverage espressoWithCream = new CreamAddOnDecorator(espresso);
        Beverage espressoWithCreamAndCaramel = new CaramelAddOnDecorator(espressoWithCream);
        int actualOutput = espressoWithCreamAndCaramel.cost();
        int expectedOutput = 8;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void latteWithCaramelShouldReturnFive() {
        Beverage latte = new Latte();
        Beverage latteWithCaramel = new CaramelAddOnDecorator(latte);
        int actualOutput = latteWithCaramel.cost();
        int expectedOutput = 5;

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void latteWithCreamShouldReturnFive() {
        Beverage latte = new Latte();
        Beverage latteWithCream = new CreamAddOnDecorator(latte);
        int actualOutput = latteWithCream.cost();
        int expectedOutput = 5;

        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void latteWithCreamAndCaramelShouldReturnEight() {
        Beverage latte = new Latte();
        Beverage latteWithCream = new CreamAddOnDecorator(latte);
        Beverage latteWithCreamAndCaramel = new CaramelAddOnDecorator(latteWithCream);
        int actualOutput = latteWithCreamAndCaramel.cost();
        int expectedOutput = 8;

        assertEquals(expectedOutput, actualOutput);
    }



}