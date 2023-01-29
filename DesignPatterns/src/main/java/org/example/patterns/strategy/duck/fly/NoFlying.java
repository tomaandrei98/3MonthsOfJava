package org.example.patterns.strategy.duck.fly;

public class NoFlying implements IFlyBehaviour{
    @Override
    public String fly() {
        return "No flying";
    }
}
