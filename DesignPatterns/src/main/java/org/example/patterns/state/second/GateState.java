package org.example.patterns.state.second;

public interface GateState {
    void enter();
    void pay();
    void payOk();
    void payFailed();
}
