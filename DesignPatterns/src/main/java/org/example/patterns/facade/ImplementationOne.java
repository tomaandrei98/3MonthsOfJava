package org.example.patterns.facade;

public class ImplementationOne {
    private ImplementationFive implementationFive;

    public ImplementationOne(ImplementationFive implementationFive) {
        this.implementationFive = implementationFive;
    }
}
