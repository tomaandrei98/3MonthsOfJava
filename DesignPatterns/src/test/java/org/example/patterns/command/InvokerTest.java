package org.example.patterns.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvokerTest {
    private Invoker invoker;
    private Receiver light;

    @BeforeEach
    public void setup() {
        light = new Receiver();
        invoker = new Invoker(
                new LightOnCommand(light),
                new LightOffCommand(light),
                new LightUpCommand(light),
                new LightDownCommand(light)
        );
    }

    @Test
    public void shouldReturnNullForEmptyHistory() {
        Command actualOutput = invoker.undo();
        assertNull(actualOutput);
    }

    @Test
    public void shouldReturnTheSingleCommandForOneElementInDeque() {
        invoker.clickOn();
        Command expectedOutput = invoker.getHistory().getLast();
        Command actualOutput = invoker.undo();
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void shouldReturnADequeSizeOfFiveAfterFiveMethodCallsWithinTheInvoker() {
        invoker.clickUp();
        invoker.clickDown();
        invoker.clickOff();
        invoker.clickOn();
        invoker.clickDown();
        int actualOutput = invoker.getHistory().size();
        int expectedOutput = 5;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnTheLastCommandForMoreElementsInDeque() {
        invoker.clickDown();
        invoker.clickUp();
        Command expectedOutput = invoker.getHistory().getLast();
        Command actualOutput = invoker.undo();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnFalseForANewLight() {
        boolean actualOutput = light.getState();
        assertFalse(actualOutput);
    }

    @Test
    public void shouldReturnTrueForAnOpenedLight() {
        invoker.clickOn();
        boolean actualOutput = light.getState();
        assertTrue(actualOutput);
    }

    @Test
    public void shouldReturnZeroIntensityForANewLight() {
        int actualOutput = light.getIntensity();
        int expectedOutput = 0;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnZeroIntensityForAOpenedLight() {
        invoker.clickOn();
        int actualOutput = light.getIntensity();
        int expectedOutput = 10;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnNineIntensityForAOpenedLightWithOneCallToDimDown() {
        invoker.clickOn();
        invoker.clickDown();
        int actualOutput = light.getIntensity();
        int expectedOutput = 9;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnEightIntensityForAOpenedLightWithTwoCallsToDimDown() {
        invoker.clickOn();
        invoker.clickDown();
        invoker.clickDown();
        int actualOutput = light.getIntensity();
        int expectedOutput = 8;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnTenIntensityForAOpenedLightWithACallToDimUpAboveTen() {
        invoker.clickOn();
        invoker.clickUp();
        int actualOutput = light.getIntensity();
        int expectedOutput = 10;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnZeroIntensityForAOpenedLightWithTenCallsToDimDown() {
        invoker.clickOn();
        for (int i = 0; i < 10; i++) {
            invoker.clickDown();
        }

        int actualOutput = light.getIntensity();
        int expectedOutput = 0;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnFalseForAOpenedLightWithTenCallsToDimDown() {
        invoker.clickOn();
        for (int i = 0; i < 10; i++) {
            invoker.clickDown();
        }

        boolean actualOutput = light.getState();
        assertFalse(actualOutput);
    }

    @Test
    public void shouldReturnZeroForANewLightWithACallToDimDown() {
        invoker.clickDown();
        int actualOutput = light.getIntensity();
        int expectedOutput = 0;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnFalseForANewLightWithACallToDimDown() {
        invoker.clickDown();
        boolean actualOutput = light.getState();
        assertFalse(actualOutput);
    }

    @Test
    public void shouldReturnNineForAOpenedLightWithTwoCallsToDimDownAndOneCallToDimUp() {
        invoker.clickOn();
        invoker.clickDown();
        invoker.clickDown();
        invoker.clickUp();
        int actualOutput = light.getIntensity();
        int expectedOutput = 9;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnFalseForAOpenedLightWithACallToUndo() {
        invoker.clickOn();
        invoker.undo();
        boolean actualOutput = light.getState();
        assertFalse(actualOutput);
    }

    @Test
    public void shouldReturnTrueForAClosedLightWithACallToUndo() {
        invoker.clickOff();
        invoker.undo();
        boolean actualOutput = light.getState();
        assertTrue(actualOutput);
    }

    @Test
    public void shouldReturnNineForAOpenedLightWithTwoCallsOnDimDownAndOneCallToUndo() {
        invoker.clickOn();
        invoker.clickDown();
        invoker.clickDown();
        invoker.undo();

        int actualOutput = light.getIntensity();
        int expectedOutput = 9;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnNineForAOpenedLightWithOneCallOnDimDownOneCallOnDimUpAndOneCallToUndo() {
        invoker.clickOn();
        invoker.clickDown();
        invoker.clickUp();
        invoker.undo();

        int actualOutput = light.getIntensity();
        int expectedOutput = 9;
        assertEquals(expectedOutput, actualOutput);
    }

}