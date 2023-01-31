package org.example.patterns.decorator;

public class CaramelAddOnDecorator extends AddOnDecorator {
    private Beverage beverage;

    public CaramelAddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 3;
    }
}
