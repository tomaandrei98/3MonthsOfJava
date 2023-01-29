package org.example.patterns.strategy;

import org.example.patterns.strategy.client.Client;
import org.example.patterns.strategy.client.IConcreteClientBehaviourA;
import org.example.patterns.strategy.client.IConcreteClientBehaviourB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void runTestForConcreteBehaviourA() {
        //given
        Client clientWithBehaviourA = new Client(new IConcreteClientBehaviourA());
        String actualOutput = clientWithBehaviourA.run();
        String expectedOutput = "A run's";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void runTestForConcreteBehaviourB() {
        //given
        Client clientWithBehaviourB = new Client(new IConcreteClientBehaviourB());
        String actualOutput = clientWithBehaviourB.run();
        String expectedOutput = "B run's";

        assertEquals(expectedOutput, actualOutput);
    }
}