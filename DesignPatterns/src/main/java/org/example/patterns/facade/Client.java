package org.example.patterns.facade;

public class Client {
    private Facade facade;

    public Client() {
        this.facade = new Facade(
                new ImplementationOne(new ImplementationFive()),
                new ImplementationTwo(new ImplementationFour(new ImplementationOne(new ImplementationFive()))),
                new ImplementationThree(new ImplementationTwo(new ImplementationFour(new ImplementationOne(new ImplementationFive())))),
                new ImplementationFour(new ImplementationOne(new ImplementationFive())),
                new ImplementationFive()
        );
    }
}
