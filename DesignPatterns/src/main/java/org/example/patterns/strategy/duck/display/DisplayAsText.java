package org.example.patterns.strategy.duck.display;

public class DisplayAsText implements IDisplayBehaviour{
    @Override
    public String display() {
        return "Display Text";
    }
}
