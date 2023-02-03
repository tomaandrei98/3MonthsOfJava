package org.example.patterns.command;

public class LightUpCommand implements Command {
    private final Receiver light;

    public LightUpCommand(Receiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
    }

    @Override
    public void unExecute() {
        light.down();
    }
}
