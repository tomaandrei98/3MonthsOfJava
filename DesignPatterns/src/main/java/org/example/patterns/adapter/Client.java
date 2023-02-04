package org.example.patterns.adapter;

public class Client {
    public final ITarget target;

    public Client() {
        this.target = new Adapter(new Adaptee());
    }
}
