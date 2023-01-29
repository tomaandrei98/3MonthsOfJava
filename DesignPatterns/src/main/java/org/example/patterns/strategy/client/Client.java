package org.example.patterns.strategy.client;

public class Client implements IClientBehaviour {

    private final IClientBehaviour iClientBehaviour;

    public Client(IClientBehaviour iClientBehaviour) {
        this.iClientBehaviour = iClientBehaviour;
    }

    @Override
    public String run() {
        return iClientBehaviour.run();
    }
}
