package org.example.patterns.state.second;

public class Gate {
    private GateState state;

    public Gate() {
        this.state = new ClosedGateState(this);
    }

    public void enter() {
        state.enter();
    }

    public void pay() {
        state.pay();
    }

    public void payOk() {
        state.payOk();
    }

    public void payFailed() {
        state.payFailed();
    }


    public void changeState(GateState gateState) {
        state = gateState;
    }
}
