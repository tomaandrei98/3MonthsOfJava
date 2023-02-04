package org.example.patterns.facade;

public class Facade {
    private ImplementationOne implementationOne;
    private ImplementationTwo implementationTwo;
    private ImplementationThree implementationThree;
    private ImplementationFour implementationFour;
    private ImplementationFive implementationFive;


    public Facade(
            ImplementationOne implementationOne,
            ImplementationTwo implementationTwo,
            ImplementationThree implementationThree,
            ImplementationFour implementationFour,
            ImplementationFive implementationFive
    ) {
        this.implementationOne = implementationOne;
        this.implementationTwo = implementationTwo;
        this.implementationThree = implementationThree;
        this.implementationFour = implementationFour;
        this.implementationFive = implementationFive;
    }
}
