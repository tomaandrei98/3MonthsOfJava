package org.example.patterns.state.second;

public class OpenGateState implements GateState {

    private Gate gate;

    public OpenGateState(Gate gate) {
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
        // let user in
        gate.changeState(new ClosedGateState(gate));
    }

    @Override
    public void payFailed() {

    }
}
