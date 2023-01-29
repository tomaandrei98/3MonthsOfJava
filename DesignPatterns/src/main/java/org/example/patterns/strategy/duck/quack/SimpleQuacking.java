package org.example.patterns.strategy.duck.quack;

public class SimpleQuacking implements IQuackBehaviour {

    @Override
    public String quack() {
        return "Simple Quack";
    }
}
