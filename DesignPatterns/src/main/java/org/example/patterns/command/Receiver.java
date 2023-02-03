package org.example.patterns.command;

public class Receiver {
    private boolean isOn = false;
    private int intensity = 0;

    public void on() {
        isOn = true;
        intensity = 10;
    }
    public void off() {
        isOn = false;
        intensity = 0;
    }
    public void up() {
        if (isOn && intensity < 10) {
            intensity++;
        }
    }
    public void down() {
        if (isOn && intensity > 0) {
            intensity--;
            if (intensity == 0) {
                off();
            }
        }
    }

    public boolean getState() {
        return isOn;
    }

    public int getIntensity() {
        return intensity;
    }
}
