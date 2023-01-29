package org.example.patterns.strategy.duck;

import org.example.patterns.strategy.duck.display.DisplayAsGraphics;
import org.example.patterns.strategy.duck.display.DisplayAsText;
import org.example.patterns.strategy.duck.fly.JetFlying;
import org.example.patterns.strategy.duck.fly.NoFlying;
import org.example.patterns.strategy.duck.fly.SimpleFlying;
import org.example.patterns.strategy.duck.quack.LoudQuacking;
import org.example.patterns.strategy.duck.quack.SimpleQuacking;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
    private static Duck simpleQuackSimpleFlyDisplayAsTextDuck;
    private static Duck loudQuackJetFlyDisplayAsGraphicsDuck;
    private static Duck simpleQuackNoFlyDisplayAsGraphicsDuck;

    @BeforeAll
    public static void createDucks() {
        simpleQuackSimpleFlyDisplayAsTextDuck = new Duck(new SimpleQuacking(), new SimpleFlying(), new DisplayAsText());
        loudQuackJetFlyDisplayAsGraphicsDuck = new Duck(new LoudQuacking(), new JetFlying(), new DisplayAsGraphics());
        simpleQuackNoFlyDisplayAsGraphicsDuck = new Duck(new SimpleQuacking(), new NoFlying(), new DisplayAsGraphics());
    }

    @Test
    public void simpleQuackingTest() {
        String actualOutput = simpleQuackSimpleFlyDisplayAsTextDuck.quack();
        String expectedOutput = "Simple Quack";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void loudQuackingTest() {
        String actualOutput = loudQuackJetFlyDisplayAsGraphicsDuck.quack();
        String expectedOutput = "Loud Quack";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void noFlyingTest() {
        String actualOutput = simpleQuackNoFlyDisplayAsGraphicsDuck.fly();
        String expectedOutput = "No flying";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void simpleFlyingTest() {
        String actualOutput = simpleQuackSimpleFlyDisplayAsTextDuck.fly();
        String expectedOutput = "Simple fly";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void jetFlyingTest() {
        String actualOutput = loudQuackJetFlyDisplayAsGraphicsDuck.fly();
        String expectedOutput = "Jet Flying";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void displayAsGraphicsTest() {
        String actualOutput = loudQuackJetFlyDisplayAsGraphicsDuck.display();
        String expectedOutput = "Display Graphics";
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void displayAsTextTest() {
        String actualOutput = simpleQuackSimpleFlyDisplayAsTextDuck.display();
        String expectedOutput = "Display Text";
        assertEquals(expectedOutput, actualOutput);
    }

}