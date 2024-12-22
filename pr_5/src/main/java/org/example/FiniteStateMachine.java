package org.example;

public class FiniteStateMachine {
    public enum State {
        S, ONE, TWO, THREE, F
    }

    private State currentState;

    public FiniteStateMachine() {
        this.currentState = State.S;
    }


    public State process(char c) {
        switch (currentState) {
            case S:
                currentState = (c == 'T') ? State.ONE : State.S;
                break;
            case ONE:
                currentState = (c == 'E') ? State.TWO : State.S;
                break;
            case TWO:
                currentState = (c == 'S') ? State.THREE : State.S;
                break;
            case THREE:
                currentState = (c == 'T') ? State.F : State.S;
                break;
            case F:
                // Після досягнення стану F автомат залишається в ньому
                break;
        }
        return currentState;
    }

    public boolean isFinal() {
        return currentState == State.F;
    }

    public State getCurrentState() {
        return currentState;
    }
}
