package org.example.patterns.decorator;

public class CreamAddOnDecorator extends Beverage {
    private Beverage beverage;

    public CreamAddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 3;
    }
}
