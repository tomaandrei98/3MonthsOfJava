package org.example.patterns.state.first;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
