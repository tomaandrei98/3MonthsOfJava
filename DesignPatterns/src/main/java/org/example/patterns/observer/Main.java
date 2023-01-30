package org.example.patterns.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        weatherStation.addObserver(phoneDisplay);

        System.out.println(phoneDisplay.getTemperature());

        weatherStation.setTemperature(10);
        System.out.println(phoneDisplay.getTemperature());

        weatherStation.setTemperature(5);
        System.out.println(phoneDisplay.getTemperature());
    }
}
