package org.example.patterns.strategy.duck;

import org.example.patterns.strategy.duck.display.IDisplayBehaviour;
import org.example.patterns.strategy.duck.fly.IFlyBehaviour;
import org.example.patterns.strategy.duck.quack.IQuackBehaviour;

public class Duck {
    private final IQuackBehaviour iQuackBehaviour;
    private final IFlyBehaviour iFlyBehaviour;
    private final IDisplayBehaviour iDisplayBehaviour;

    public Duck(IQuackBehaviour iQuackBehaviour, IFlyBehaviour iFlyBehaviour, IDisplayBehaviour iDisplayBehaviour) {
        this.iQuackBehaviour = iQuackBehaviour;
        this.iFlyBehaviour = iFlyBehaviour;
        this.iDisplayBehaviour = iDisplayBehaviour;
    }

    public String quack() {
        return iQuackBehaviour.quack();
    }

    public String fly() {
        return iFlyBehaviour.fly();
    }

    public String display() {
        return iDisplayBehaviour.display();
    }

}
