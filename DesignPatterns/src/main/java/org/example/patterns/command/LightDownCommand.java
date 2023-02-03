package org.example.patterns.command;

public class LightDownCommand implements Command {
    private final Receiver light;

    public LightDownCommand(Receiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
    }

    @Override
    public void unExecute() {
        light.up();
    }
}
