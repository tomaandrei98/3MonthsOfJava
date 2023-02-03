package org.example.patterns.command;

public class LightOffCommand implements Command{
    private final Receiver light;

    public LightOffCommand(Receiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void unExecute() {
        light.on();
    }

}
