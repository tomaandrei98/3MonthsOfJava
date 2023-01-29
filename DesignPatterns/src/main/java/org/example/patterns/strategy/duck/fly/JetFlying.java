package org.example.patterns.strategy.duck.fly;

import org.example.patterns.strategy.duck.fly.IFlyBehaviour;

public class JetFlying implements IFlyBehaviour {
    @Override
    public String fly() {
        return "Jet Flying";
    }
}
