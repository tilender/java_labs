package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FiniteStateMachineTest {

    @ParameterizedTest
    @CsvSource({
            "'abcTESTabc', F",
            "'TEST', F",
            "'T', ONE",
            "'TE', TWO",
            "'TES', THREE",
            "'TESTX', F",
            "'', S",
            "'SOMETHING', S",
            "'TESTTEST', F",
            "'TTTT', ONE"
    })
    void testFiniteStateMachine(String input, String expectedState) {
        FiniteStateMachine fsm = new FiniteStateMachine();

        input.chars().mapToObj(c -> (char) c).forEach(fsm::process);

        assertEquals(FiniteStateMachine.State.valueOf(expectedState), fsm.getCurrentState());
    }
}
