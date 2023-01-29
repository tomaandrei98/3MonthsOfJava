package org.example.patterns.strategy.duck.fly;

public class SimpleFlying implements IFlyBehaviour{
    @Override
    public String fly() {
        return "Simple fly";
    }
}
