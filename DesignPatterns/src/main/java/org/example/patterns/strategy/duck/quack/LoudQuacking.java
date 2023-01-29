package org.example.patterns.strategy.duck.quack;

public class LoudQuacking implements IQuackBehaviour {
    @Override
    public String quack() {
        return "Loud Quack";
    }
}
