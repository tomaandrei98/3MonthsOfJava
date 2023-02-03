package org.example.patterns.command;

public class LightOnCommand implements Command {
    private final Receiver light;

    public LightOnCommand(Receiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void unExecute() {
        light.off();
    }
}
