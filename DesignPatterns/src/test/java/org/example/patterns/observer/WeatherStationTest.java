package org.example.patterns.observer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherStationTest {
    private WeatherStation weatherStation;
    private PhoneDisplay phoneDisplay;
    private WindowDisplay windowDisplay;

    @BeforeEach
    public void setup() {
        weatherStation = new WeatherStation();
        phoneDisplay = new PhoneDisplay(weatherStation);
        windowDisplay = new WindowDisplay(weatherStation);
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(windowDisplay);
    }

    @Test
    public void shouldReturnZeroForPhoneDisplay() {
        int actualOutput = phoneDisplay.getTemperature();
        int expectedOutput = 0;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnTenForPhoneDisplay() {
        weatherStation.setTemperature(10);
        int actualOutput = phoneDisplay.getTemperature();
        int expectedOutput = 10;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnThirtyForPhoneDisplay() {
        weatherStation.setTemperature(30);
        int actualOutput = phoneDisplay.getTemperature();
        int expectedOutput = 30;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnZeroForWindowDisplay() {
        int actualOutput = windowDisplay.getTemperature();
        int expectedOutput = 0;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnTenForWindowDisplay() {
        weatherStation.setTemperature(10);
        int actualOutput = windowDisplay.getTemperature();
        int expectedOutput = 10;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnThirtyForWindowDisplay() {
        weatherStation.setTemperature(30);
        int actualOutput = windowDisplay.getTemperature();
        int expectedOutput = 30;
        assertEquals(expectedOutput, actualOutput);
    }


}