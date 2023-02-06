package org.example.patterns.proxy;

public class Client {
    private LazyBookParserProxy proxy;

    public Client(LazyBookParserProxy proxy) {
        this.proxy = proxy;
    }

}
