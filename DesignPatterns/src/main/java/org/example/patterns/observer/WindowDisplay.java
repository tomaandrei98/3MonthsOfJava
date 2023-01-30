package org.example.patterns.observer;

public class WindowDisplay  implements IObserver{
    private WeatherStation weatherStation;

    private int temperature = 0;

    public WindowDisplay(WeatherStation weatherStation) {
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
