package org.example.patterns.command;

import java.util.*;

public class Invoker {
    private final Command on;
    private final Command off;
    private final Command up;
    private final Command down;
    private final Deque<Command> history = new LinkedList<>();

    public Invoker(Command on, Command off, Command up, Command down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void clickOn() {
        on.execute();
        history.add(on);
    }
    public void clickOff() {
        off.execute();
        history.add(off);
    }
    public void clickUp() {
        up.execute();
        history.add(up);
    }
    public void clickDown() {
        down.execute();
        history.add(down);
    }

    public Deque<Command> getHistory() {
        return history;
    }

    public Command undo() {
        if (history.size() == 0) {
            return null;
        }
        Command prevCommand = history.removeLast();
        prevCommand.unExecute();
        return prevCommand;
    }
}
