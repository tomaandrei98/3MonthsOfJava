package org.example.patterns.state.second;

public class ClosedGateState implements GateState {
    private Gate gate;

    public ClosedGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {

    }

    @Override
    public void pay() {

    }

    @Override
    public void payOk() {

    }

    @Override
    public void payFailed() {

    }
}
