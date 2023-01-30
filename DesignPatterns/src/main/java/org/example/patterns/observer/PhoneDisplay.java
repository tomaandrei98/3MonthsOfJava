package org.example.patterns.observer;

public class PhoneDisplay implements IObserver {

    private WeatherStation weatherStation;

    private int temperature = 0;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
    }
}
