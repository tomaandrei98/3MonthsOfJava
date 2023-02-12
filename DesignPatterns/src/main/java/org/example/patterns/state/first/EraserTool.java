package org.example.patterns.state.first;

public class EraserTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Erase icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }
}
